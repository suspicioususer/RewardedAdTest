package com.project.demos.rewardedadtest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private Button btnWatchAd;
    private RewardedAd rewardedAd;

    private final String MAIN_TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RequestConfiguration requestConfiguration = new RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList("DEVICE_ID")).build();
        MobileAds.setRequestConfiguration(requestConfiguration);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        });

        rewardedAd = createAndLoadRewardedAd();

        btnWatchAd = findViewById(R.id.btnWatchAd);
        btnWatchAd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(MAIN_TAG, "Ad button clicked.");
                if (rewardedAd.isLoaded()) {
                    RewardedAdCallback adCallback = new RewardedAdCallback() {
                        @Override
                        public void onRewardedAdOpened() {
                            Log.i(MAIN_TAG, "Ad opened.");
                        }

                        @Override
                        public void onRewardedAdClosed() {
                            Log.i(MAIN_TAG, "Ad closed.");
                            rewardedAd = createAndLoadRewardedAd();
                        }

                        @Override
                        public void onUserEarnedReward(@NonNull RewardItem reward) {
                            Log.i(MAIN_TAG, "Reward earned.");
                        }

                        @Override
                        public void onRewardedAdFailedToShow(int errorCode) {
                            Log.e(MAIN_TAG, "Ad failed to show. errorCode: " + errorCode);
                        }
                    };
                    rewardedAd.show(MainActivity.this, adCallback);
                } else {
                    Toast.makeText(MainActivity.this, "Ad has not loaded yet.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private RewardedAd createAndLoadRewardedAd() {
        RewardedAd rewardedAd = new RewardedAd(this, "ca-app-pub-3940256099942544/5224354917");
        RewardedAdLoadCallback adLoadCallback = new RewardedAdLoadCallback() {
            @Override
            public void onRewardedAdLoaded() {
                Log.i(MAIN_TAG, "Ad loaded.");
            }

            @Override
            public void onRewardedAdFailedToLoad(int errorCode) {
                Log.e(MAIN_TAG, "Ad failed to load. errorCode: " + errorCode);
            }
        };
        rewardedAd.loadAd(new AdRequest.Builder().build(), adLoadCallback);
        return rewardedAd;
    }
}
