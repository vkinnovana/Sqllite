package com.tarotlife.tarot.card.reading.numerology.horoscope;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.tarotlife.tarot.card.reading.numerology.R;
import com.tarotlife.tarot.card.reading.numerology.horoscope.data.model.GetDailyHoroscopeMainResult;
import com.tarotlife.tarot.card.reading.numerology.horoscope.data.model.Post;
import com.tarotlife.tarot.card.reading.numerology.horoscope.data.remote.APIService;
import com.tarotlife.tarot.card.reading.numerology.horoscope.data.remote.ApiUtils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DashBoardActivity extends Activity {
    private static final String TAG = DashBoardActivity.class.getSimpleName();
    private TextView mResponseTv;

    private APIService mAPIService;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dash_test);

        final EditText titleEt = (EditText) findViewById(R.id.et_title);
        final EditText bodyEt = (EditText) findViewById(R.id.et_body);
        Button submitBtn = (Button) findViewById(R.id.btn_submit);
        mResponseTv = (TextView) findViewById(R.id.tv_response);

        mAPIService = ApiUtils.getAPIService();

        sendPost("1", "8", "1", "2021");


    }


    public void showErrorMessage() {
        Toast.makeText(this, "mssg_error_submitting_post", Toast.LENGTH_SHORT).show();
    }


    public void sendPost(String Day, String Month, String LanguageCode, String Year) {

        mAPIService.savePost(getHoroData(Day, Month, LanguageCode, Year)).enqueue(new Callback<GetDailyHoroscopeMainResult>() {
            @Override
            public void onResponse(Call<GetDailyHoroscopeMainResult> call, Response<GetDailyHoroscopeMainResult> response) {
                Log.i(TAG, "post submitted to API." + response.toString());
                if (response != null) {
                    showResponse(response.body().toString());
                }
            }

            @Override
            public void onFailure(Call<GetDailyHoroscopeMainResult> call, Throwable t) {

                showErrorMessage();
                Log.e(TAG, "Unable to submit post to API.");
            }
        });
    }

    private Post getHoroData(String day, String month, String languageCode, String year) {
        return new Post(day, month, languageCode, year);
    }


    public void showResponse(String response) {
        if (mResponseTv.getVisibility() == View.GONE) {
            mResponseTv.setVisibility(View.VISIBLE);
        }
        mResponseTv.setText(response);
    }
}
