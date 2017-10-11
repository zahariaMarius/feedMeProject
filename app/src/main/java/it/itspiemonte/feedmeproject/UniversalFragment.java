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

import static android.support.v4.content.res.ResourcesCompat.getDrawable;

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
    TextView testo;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = (ViewGroup) inflater.inflate(R.layout.fragment_tutorial, container, false);

        imageView = (ImageView)rootView.findViewById(R.id.imgTutorial);
        check1 = (ImageView)rootView.findViewById(R.id.check1);
        check2 = (ImageView)rootView.findViewById(R.id.check2);
        check3 = (ImageView)rootView.findViewById(R.id.check3);
        testo = (TextView)rootView.findViewById(R.id.testoTutorial);
        Button buttonTutorial = (Button) rootView.findViewById(R.id.buttonTutorial);

        buttonTutorial.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Log.d(String.valueOf(count), "pigiato");

                count++;

                 if (count == 1){
                    imageView.setBackground(getDrawable(getResources(),R.drawable.posate,null));
                     testo.setText(R.string.testo_tutorial2);
                     check2.setBackground(getDrawable(getResources(),R.drawable.check,null));
                }
                else if (count == 2){
                     imageView.setBackground(getDrawable(getResources(),R.drawable.cart,null));
                     testo.setText(R.string.testo_tutorial3);
                     check3.setBackground(getDrawable(getResources(),R.drawable.check,null));
                }



            }
        });

        if (count == 0){
            //  imageView.setBackgroundColor(getResources().getColor(R.color.color));
            imageView.setBackground(getDrawable(getResources(),R.drawable.world,null));
            testo.setText(R.string.testo_tutorial1);
            check1.setBackground(getDrawable(getResources(),R.drawable.check,null));
        }

        return rootView;
    }



    
}