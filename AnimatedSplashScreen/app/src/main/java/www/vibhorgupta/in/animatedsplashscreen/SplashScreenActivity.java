package www.vibhorgupta.in.animatedsplashscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

/**
 * Created by vibhorgupta on 12/12/17.
 */

public class SplashScreenActivity extends Activity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        final ImageView splashImage = findViewById(R.id.splash_image);
        final TextView  splashText =  findViewById(R.id.splash_text);
        final Animation animationOne = AnimationUtils.loadAnimation(getBaseContext(),R.anim.fade_in);
        final Animation animationTwo = AnimationUtils.loadAnimation(getBaseContext(),R.anim.rotate);
        final Animation animationThree = AnimationUtils.loadAnimation(getBaseContext(),R.anim.anti_rotate);
        final Animation animationFour = AnimationUtils.loadAnimation(getBaseContext(),R.anim.fade_out);

        splashImage.startAnimation(animationOne);
        animationOne.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                splashImage.startAnimation(animationTwo);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });



        animationTwo.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {



            }

            @Override
            public void onAnimationEnd(Animation animation) {
                splashImage.startAnimation(animationThree);
                //finish();

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });


        animationThree.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {



            }

            @Override
            public void onAnimationEnd(Animation animation) {
                splashImage.startAnimation(animationFour);
                finish();
                Intent i = new Intent(getBaseContext(),MainActivity.class);
                startActivity(i);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }
//
//    private void hide(View v, int duration) { v.animate().alpha(0f).setDuration(duration); }
//
//    private void show(View v, int duration) { v.animate().alpha(1f).setDuration(duration); }
}
