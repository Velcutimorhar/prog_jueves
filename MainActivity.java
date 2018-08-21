package velcutimorhar.photoapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    System.loadLibrary("NativeImageProcessor");
    button refreshButton;
    ProgressDialog pDialog;
    private static final String PHOTOSERVICE_URL = "http://play.minio.io:8080/PhotoAPIService-0.0.1-SNAPSHOT/minio/photoservice/list";
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        imageView = (ImageView) findViewById(R.id.imageView);

        refreshButton = (Button) findViewById(R.id.button);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        refreshButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // An async task fetches all the latest photo URLs from the PhotoAPIService.
                new LoadImage().execute(PHOTOSERVICE_URL);
            }
        });
    }
    private class LoadImage extends AsyncTask<String, String, Bitmap> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pDialog = new ProgressDialog(MainActivity.this);
            pDialog.setMessage("Fetching Image from Minio Server....");
            pDialog.show();
        }

        protected Bitmap doInBackground(String... args) {
            InputStream inputStream = null;
            String result = "";

            try {
                URL url = new URL(args[0]);

                HttpURLConnection httpCon =
                        (HttpURLConnection) url.openConnection();

                if (httpCon.getResponseCode() != 200)
                    throw new Exception("Failed to connect");

                // Fetch the content as an inputStream.
                inputStream = httpCon.getInputStream();

                // Convert the fetched inputstream to string.
                if (inputStream != null)
                    result = convertInputStreamToString(inputStream);
                else
                    result = "Did not work!";

                if (result != null) System.out.println(result);

                // convert String to JSONObject.
                JSONObject json = new JSONObject(result);

                // get the array of photos.
                JSONArray imageJSON = json.getJSONArray("Album");
                int index = imageJSON.length()-1;

                Random rand = new Random();

                // Let's get a randomly pic a picture to load.
                int rindex = rand.nextInt((index - 0) + 1) + 0;


                // Return the image.
                return BitmapFactory.decodeStream(new URL(imageJSON.getJSONObject(rindex).getString("url")).openStream());
            } catch (Exception e) {

                System.out.println(e.getMessage());
            }
            return null;

        }


        protected void onPostExecute(Bitmap image) {
            System.out.println("In Post Execute");
            if (image != null) {
                pDialog.dismiss();
                // Place the image on the ImageView.
                imageView.setImageBitmap(image);

            } else
            {
                pDialog.dismiss();
                Toast.makeText(MainActivity.this, "Image Does Not exist or Network Error", Toast.LENGTH_SHORT).show();
            }

        }

    }
    private static String convertInputStreamToString(InputStream inputStream) throws IOException{

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(inputStream));
        String line = "";
        String result = "";

        // Loop through the stream line by line and convert to a String.
        while((line = bufferedReader.readLine()) != null)
            result += line;

        inputStream.close();
        return result;

    }}