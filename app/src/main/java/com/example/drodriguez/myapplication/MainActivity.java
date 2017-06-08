package com.example.drodriguez.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.libstatistical.SimpleOperations;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.edOperand)
    EditText edOperand;
    @BindView(R.id.txtResult)
    TextView txtResult;
    @BindView(R.id.btnOper)
    Button btnOper;

    @OnClick(R.id.btnOper)
    protected void setBtnOperClick()
    {
        int index = -1;
        String operand = edOperand.getText().toString();
        SimpleOperations simpleOperations = new SimpleOperations();
        String[] strings = operand.split("[-+*/]");
        int result = 0;
        if( operand.indexOf("+") > -1)
        {
            result = simpleOperations.add(Integer.parseInt(strings[0]), Integer.parseInt(strings[1]));
        }

        if( operand.indexOf("-") > -1)
        {
            result = simpleOperations.diff(Integer.parseInt(strings[0]), Integer.parseInt(strings[1]));
        }

        if( operand.indexOf("*") > -1)
        {
            result = simpleOperations.mult(Integer.parseInt(strings[0]), Integer.parseInt(strings[1]));
        }

        if( operand.indexOf("/") > -1)
        {
            result = simpleOperations.div(Integer.parseInt(strings[0]), Integer.parseInt(strings[1]));
        }

        txtResult.setText(String.valueOf(result));


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }
}
