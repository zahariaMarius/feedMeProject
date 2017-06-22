package it.itspiemonte.feedmeproject;

import android.app.Fragment;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Simone on 20/06/2017.
 */

public class UniversalFragment extends Fragment {

    ViewGroup rootView;
    private int count = 0;
    ImageView imageView;
    ImageView check1;
    ImageView check2;
    ImageView check3;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = (ViewGroup) inflater.inflate(R.layout.fragment_tutorial, container, false);

        imageView = (ImageView)rootView.findViewById(R.id.imgTutorial);
        Button buttonTutorial = (Button) rootView.findViewById(R.id.buttonTutorial);

        buttonTutorial.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Log.d(String.valueOf(count), "pigiato");

                count++;

                 if (count == 1){
                    imageView.setBackground(getResources().getDrawable(R.drawable.posate));
                }
                else if (count == 2){
                    imageView.setBackground(getResources().getDrawable(R.drawable.cart));
                }



            }
        });

        if (count == 0){
            //  imageView.setBackgroundColor(getResources().getColor(R.color.color));
            imageView.setBackground(getResources().getDrawable(R.drawable.world));
        }

        return rootView;
    }



    
}