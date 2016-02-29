package cn.edu.nuc.jisuanqi;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    private Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0,bt_point;
    private Button bt_clear,bt_division,bt_multiply,bt_delete,bt_minus,bt_plus,bt_kuohao,bt_change,bt_run;
    private StringBuffer str1=new StringBuffer();
    private StringBuffer str2=new StringBuffer();
    private StringBuffer str=new StringBuffer();
    private static String TAG="MainActivity";
    private boolean flag=false;              //记录是否需要清空
    private StringBuffer answer=new StringBuffer();        //记录答案
    private TextView tv1,tv2;
    private int khnum;                   //记录所加入的左括号总数
    private char[] s1=new char[15];     //字符栈
    private char c;                     //存储字符
    private double[] jisuan=new double[10];     //数组栈
    private double number=2000000001;   //默认无穷大
    private int left=0;                 //记录是否为小数
    private int top=0;                  //记录栈
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1= (TextView) findViewById(R.id.string3);
        tv2= (TextView) findViewById(R.id.string2);
        bt0= (Button) findViewById(R.id.number0);
        bt1= (Button) findViewById(R.id.number1);
        bt2= (Button) findViewById(R.id.number2);
        bt3= (Button) findViewById(R.id.number3);
        bt4= (Button) findViewById(R.id.number4);
        bt5= (Button) findViewById(R.id.number5);
        bt6= (Button) findViewById(R.id.number6);
        bt7= (Button) findViewById(R.id.number7);
        bt8= (Button) findViewById(R.id.number8);
        bt9= (Button) findViewById(R.id.number9);
        bt_point= (Button) findViewById(R.id.point);
        bt_clear= (Button) findViewById(R.id.clear);
        bt_division= (Button) findViewById(R.id.division);
        bt_multiply= (Button) findViewById(R.id.multiply);
        bt_delete= (Button) findViewById(R.id.delete);
        bt_minus= (Button) findViewById(R.id.minus);
        bt_plus= (Button) findViewById(R.id.plus);
        bt_kuohao= (Button) findViewById(R.id.kuohao);
        bt_change= (Button) findViewById(R.id.change);
        bt_run= (Button) findViewById(R.id.run);

        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag){
                    str2.delete(0,str2.length());
                    str2.append(str1);
                    str1.delete(0, str1.length());
                    tv1.setText(str1);
                    tv2.setText(str2);
                    flag=false;
                }
                str1.append('0');
                tv1.setText(str1);
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag){
                    str2.delete(0,str2.length());
                    str2.append(str1);
                    str1.delete(0,str1.length());
                    tv1.setText(str1);
                    tv2.setText(str2);
                    flag=false;
                }
                str1.append('1');
                tv1.setText(str1);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag){
                    str2.delete(0,str2.length());
                    str2.append(str1);
                    str1.delete(0,str1.length());
                    tv1.setText(str1);
                    tv2.setText(str2);
                    flag=false;
                }
                str1.append('2');
                tv1.setText(str1);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag){
                    str2.delete(0,str2.length());
                    str2.append(str1);
                    str1.delete(0,str1.length());
                    tv1.setText(str1);
                    tv2.setText(str2);
                    flag=false;
                }
                str1.append('3');
                tv1.setText(str1);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag){
                    str2.delete(0,str2.length());
                    str2.append(str1);
                    str1.delete(0,str1.length());
                    tv1.setText(str1);
                    tv2.setText(str2);
                    flag=false;
                }
                str1.append('4');
                tv1.setText(str1);
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag){
                    str2.delete(0,str2.length());
                    str2.append(str1);
                    str1.delete(0,str1.length());
                    tv1.setText(str1);
                    tv2.setText(str2);
                    flag=false;
                }
                str1.append('5');
                tv1.setText(str1);
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag){
                    str2.delete(0,str2.length());
                    str2.append(str1);
                    str1.delete(0,str1.length());
                    tv1.setText(str1);
                    tv2.setText(str2);
                    flag=false;
                }
                str1.append('6');
                tv1.setText(str1);
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag){
                    str2.delete(0,str2.length());
                    str2.append(str1);
                    str1.delete(0,str1.length());
                    tv1.setText(str1);
                    tv2.setText(str2);
                    flag=false;
                }
                str1.append('7');
                tv1.setText(str1);
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag){
                    str2.delete(0,str2.length());
                    str2.append(str1);
                    str1.delete(0,str1.length());
                    tv1.setText(str1);
                    tv2.setText(str2);
                    flag=false;
                }
                str1.append('8');
                tv1.setText(str1);
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag){
                    str2.delete(0,str2.length());
                    str2.append(str1);
                    str1.delete(0,str1.length());
                    tv1.setText(str1);
                    tv2.setText(str2);
                    flag=false;
                }
                str1.append('9');
                tv1.setText(str1);
            }
        });
        bt_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1.append('.');
                tv1.setText(str1);
            }
        });
        bt_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1.delete(0, str1.length());
                tv1.setText(str1);
            }
        });
        bt_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1.append('/');
                tv1.setText(str1);
            }
        });
        bt_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1.append('*');
                tv1.setText(str1);
            }
        });
        bt_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str1.length()>0){
                    str1.delete(str1.length() - 1, str1.length());
                    tv1.setText(str1);
                }
            }
        });
        bt_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1.append('-');
                tv1.setText(str1);
            }
        });
        bt_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1.append('+');
                tv1.setText(str1);
            }
        });
        bt_kuohao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (str1.charAt(str1.length()-1)){
                    case '+':
                    case '-':
                    case '*':
                    case '/':
                    case '(':
                        str1.append('(');
                        tv1.setText(str1);
                        khnum++;
                        break;
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case ')':
                        if(khnum==0){
                            str1.append('(');
                            tv1.setText(str1);
                            khnum++;
                        }else{
                            str1.append(')');
                            tv1.setText(str1);
                            khnum--;
                        }
                        break;
                    default:
                        Log.i(TAG,"switch kuohao error");
                        break;
                }
            }
        });
        bt_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1.append(answer);
                tv1.setText(str1);
            }
        });
        bt_run.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick");
                str.delete(0,str.length());
                str2.delete(0,str2.length());
                str2.append(str1);
                str.append(str1);
                System.out.println("str.length:" + str.length());
                System.out.println("str:" + str);       //用于储存原式以便转化
                System.out.println("str1:"+str1);       //储存后缀式
                System.out.println("str2:"+str2);       //储存原式
                str1.delete(0, str1.length());
                Log.i(TAG, "1");                        // 刚刚开始时str,str1,str2相等
                System.out.println("str.length:" + str.length());
                for(int i=0;i<str.length();i++){
                    c=str.charAt(i);
                    System.out.println("c:"+c);
                    System.out.println("top:"+top);
                    for(int j=0;j<top;j++){
                        System.out.print(s1[j]);
                    }
                    System.out.println();
                    switch(c){
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                        case '0':
                        case '.':
                            str1.append(c);
                            break;
                        case '(':
                            str1.append(' ');
                            s1[top]='(';
                            left++;
                            top++;
                            break;
                        case ')':
                            if(left<0){
                                System.out.println("error");
                                break;
                            }else{
                                str1.append(' ');
                                while(s1[top-1]!='('){
                                    top--;
                                    str1.append(s1[top]);
                                }
                                top--;
                                left--;
                                break;
                            }
                        case '+':
                            str1.append(' ');
                            if(top==0){
                                s1[top]='+';
                                top++;
                            }else{
                                while(top!=0&&s1[top-1]!='('){
                                    top--;
                                    str1.append(s1[top]);
                                }
                                s1[top]='+';
                                top++;
                            }
                            break;
                        case '-':
                            str1.append(' ');
                            if(top==0){
                                s1[top]='-';
                                top++;
                            }else{
                                while(top!=0&&s1[top-1]!='('){
                                    top--;
                                    str1.append(s1[top]);
                                }
                                s1[top]='-';
                                top++;
                            }
                            break;
                        case '*':
                            str1.append(' ');
                            if(top==0){
                                s1[top]='*';
                                top++;
                            }else{
                                while(top>0&&(s1[top-1]=='*'||s1[top-1]=='/')&&s1[top-1]!='('){
                                    top--;
                                    str1.append(s1[top]);
                                }
                                s1[top]='*';
                                top++;
                            }
                            break;
                        case '/':
                            str1.append(' ');
                            if(top==0){
                                s1[top]='/';
                                top++;
                            }else{
                                while(top>0&&(s1[top-1]=='*'||s1[top-1]=='/')&&s1[top-1]!='('){
                                    top--;
                                    str1.append(s1[top]);
                                }
                                s1[top]='/';
                                top++;
                            }
                            break;
                        default:
                            break;
                    }
                }
                while(top!=0){
                    top--;
                    str1.append(s1[top]);
                }
                Log.i(TAG, "2");
                top=0;
                left=0;
                System.out.println("str:" + str);
                System.out.println("str1:"+str1);
                System.out.println("str2:" + str2);                   //后缀式转换完毕
                for(int i=0;i<str1.length();i++){
                    c=str1.charAt(i);
                    switch(c){
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                        case '0':
                            if(number==2000000001){
                                number=0;
                            }
                            if(left==0){
                                number=number*10+(c-'0');
                            }else{
                                number=number+(c-'0')*(Math.pow(10, left));
                                left--;
                            }
                            break;
                        case '.':
                            if(left<0){
                                System.out.println("error");
                            }else{
                                left=-1;
                            }
                            break;
                        case ' ':
                            if(number!=2000000001){
                                jisuan[top]=number;
                                top++;
                                left=0;
                                number=2000000001;
                            }
                            break;
                        case '+':
                            if(number!=2000000001){
                                jisuan[top]=number;
                                top++;
                                left=0;
                                number=2000000001;
                            }
                            if(top<2){
                                System.out.println("running error");
                            }else{
                                jisuan[top-2]=jisuan[top-2]+jisuan[top-1];
                                top--;
                            }
                            break;
                        case '-':
                            if(number!=2000000001){
                                jisuan[top]=number;
                                top++;
                                left=0;
                                number=2000000001;
                            }
                            if(top<2){
                                System.out.println("running error");
                            }else{
                                jisuan[top-2]=jisuan[top-2]-jisuan[top-1];
                                top--;
                            }
                            break;
                        case '*':
                            if(number!=2000000001){
                                jisuan[top]=number;
                                top++;
                                left=0;
                                number=2000000001;
                            }
                            if(top<2){
                                System.out.println("running error");
                            }else{
                                jisuan[top-2]=jisuan[top-2]*jisuan[top-1];
                                top--;
                            }
                            break;
                        case '/':
                            if(number!=2000000001){
                                jisuan[top]=number;
                                top++;
                                left=0;
                                number=2000000001;
                            }
                            if(top<2){
                                System.out.println("running error");
                            }else{
                                jisuan[top-2]=jisuan[top-2]/jisuan[top-1];
                                top--;
                            }
                            break;
                        default:
                            System.out.println("input error");
                            break;
                    }
                }
                Log.i(TAG, "3");                            //最终结果
                System.out.println("str:" + str);
                System.out.println("str1:"+str1);
                System.out.println("str2:"+str2);
                for(int j=0;j<top;j++){
                    System.out.print(s1[j]);
                }
                System.out.println();
                System.out.println("top:" + top);
                if(top!=1){
                    System.out.println("inputt error");
                }else{
                    System.out.println("The answer is " + jisuan[0]);
                    tv2.setText(str2);
                    str1.delete(0, str1.length());
                    str1.append(jisuan[0]);
                    if(answer.length()!=0){
                        answer.delete(0,answer.length());
                    }
                    answer.append(jisuan[0]);
                    tv1.setText(str1);
                    flag=true;
                }
                Log.i(TAG, "4");
            }
        });
    }
}
