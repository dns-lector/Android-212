package itstep.learning.android_212;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CalcActivity extends AppCompatActivity {
    private TextView tvExpression;
    private TextView tvResult;

    @SuppressLint("DiscouragedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_calc );
        tvExpression = findViewById( R.id.calc_tv_expression );
        tvResult = findViewById( R.id.calc_tv_result );
        tvExpression.setText("");
        tvResult.setText("0");
        // findViewById( R.id.calc_btn_0 ).setOnClickListener( this::onDigitClick );
        for( int i = 0; i < 10; i++ ) {
            findViewById( // R.id.calc_btn_0
                    getResources().getIdentifier(
                            "calc_btn_" + i,
                            "id",
                            getPackageName()
                    )
            ).setOnClickListener( this::onDigitClick );
        }
    }

    private void onDigitClick( View view ) {
        String result = tvResult.getText().toString();
        result += ((Button) view).getText();
        tvResult.setText( result );
    }

}
/*
Д.З. Додати стилі до кнопки "="
Підібрати символи для функціональних кнопок
* реалізувати кнопки роботи з пам'яттю (МС, М+, ...)
 */