package itstep.learning.android_212;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // EdgeToEdge.enable(this);
        setContentView( R.layout.activity_main );
        // ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
        //     Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
        //     v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
        //     return insets;
        // });

        findViewById( R.id.button1 ).setOnClickListener( this::onButton1Click );
    }

    private void onButton1Click( View view ) {
        TextView tv = findViewById( R.id.tv_hello );
        String text = tv.getText().toString();
        text += "!";
        tv.setText( text );
    }
}
/*
Д.З. Додати до проєкту текстове поле з числом та дві кнопки "-" та "+".
Реалізувати роботу цих кнопок які зменшують
та збільшують число, до якого відносяться
 */