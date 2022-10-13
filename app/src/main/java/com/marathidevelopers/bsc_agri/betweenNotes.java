package com.marathidevelopers.bsc_agri;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;


public class betweenNotes extends AppCompatActivity {

    CardView box1;
    CardView box2;
    CardView box3;
    CardView box4;
    CardView box5;
    CardView box6;
    CardView box7;
    CardView box8;
    private InterstitialAd mInterstitialAd;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_between_notes);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        setAds();




        box1= findViewById(R.id.box1);
        box2= findViewById(R.id.box2);
        box3= findViewById(R.id.box3);
        box4= findViewById(R.id.box4);
        box5= findViewById(R.id.box5);
        box6= findViewById(R.id.box6);
        box7= findViewById(R.id.box7);
        box8= findViewById(R.id.box8);

        box1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(betweenNotes.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                            startActivity(new Intent(betweenNotes.this,sem1.class));
                            mInterstitialAd=null;
                            setAds();
                        }
                    });
                } else {
                    startActivity(new Intent(betweenNotes.this,sem1.class));
                }
            }

        });


        box2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mInterstitialAd != null) {
                    mInterstitialAd.show(betweenNotes.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                            startActivity(new Intent(betweenNotes.this,sem2.class));
                            mInterstitialAd=null;
                            setAds();
                        }
                    });
                } else {
                    startActivity(new Intent(betweenNotes.this,sem2.class));
                }
            }
        });


        box3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(betweenNotes.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                            startActivity(new Intent(betweenNotes.this,sem3.class));
                            mInterstitialAd=null;
                            setAds();
                        }
                    });
                } else {
                    startActivity(new Intent(betweenNotes.this,sem3.class));
                }            }
        });

        box4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mInterstitialAd != null) {
                    mInterstitialAd.show(betweenNotes.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                            startActivity(new Intent(betweenNotes.this,sem4.class));
                            mInterstitialAd=null;
                            setAds();
                        }
                    });
                } else {
                    startActivity(new Intent(betweenNotes.this,sem4.class));
                }            }
        });

        box5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(betweenNotes.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                            startActivity(new Intent(betweenNotes.this,sem5.class));
                            mInterstitialAd=null;
                            setAds();
                        }
                    });
                } else {
                    startActivity(new Intent(betweenNotes.this,sem5.class));
                }            }
        });

        box6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (mInterstitialAd != null) {
                    mInterstitialAd.show(betweenNotes.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                            startActivity(new Intent(betweenNotes.this,sem6.class));
                            mInterstitialAd=null;
                            setAds();
                        }
                    });
                } else {
                    startActivity(new Intent(betweenNotes.this,sem6.class));
                }            }
        });

        box7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(betweenNotes.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                            startActivity(new Intent(betweenNotes.this,sem7.class));
                            mInterstitialAd=null;
                            setAds();
                        }
                    });
                } else {
                    startActivity(new Intent(betweenNotes.this,sem7.class));
                }            }
        });

        box8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (mInterstitialAd != null) {
                    mInterstitialAd.show(betweenNotes.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                            startActivity(new Intent(betweenNotes.this,sem8.class));
                            mInterstitialAd=null;
                            setAds();
                        }
                    });
                } else {
                    startActivity(new Intent(betweenNotes.this,sem8.class));
                }            }
        });

    }

    public void setAds(){

        AdRequest adRequest = new AdRequest.Builder().build();

        InterstitialAd.load(this,getString(R.string.inter), adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                // The mInterstitialAd reference will be null until
                // an ad is loaded.
                mInterstitialAd = interstitialAd;

            }

            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                // Handle the error
                mInterstitialAd = null;
            }
        });
    }
}