package cn.tedu.test;

import java.math.BigInteger;

/**
 * Created by Administrator on 19.2.18.
 */
public class TestCase {
    @org.junit.Test
    public void test() throws Exception {
        String a="8888899999999888";
        String b="88888888888888";
        System.out.println(new BigInteger(a).add(new BigInteger(b)));
        StringBuffer sb=new StringBuffer();
        //第二部反转
        a=new StringBuffer(a).reverse().toString();
        b=new StringBuffer(b).reverse().toString();
        //第一步 补齐位数
        if(a.length()>b.length()){
            sb.append(b);
            for(int i=0;i<a.length()-b.length();i++){
                sb.append("0");
            }
            b=sb.toString();
        }else {
            sb.append(a);
            for(int i=0;i<b.length()-a.length();i++){
                sb.append("0");
            }
            a=sb.toString();
        }

        //第三步 确定结果位数
        int nSum[] =new int[a.length()+1];
        //计算
        //定义溢出位
        int over=0;
        for(int i=0;i<nSum.length;i++){
            if(i==nSum.length-1){
                nSum[nSum.length-1]=over;
                continue;
            }
            nSum[i]=Integer.parseInt(String.valueOf(a.charAt(i)))+
                    Integer.parseInt(String.valueOf(b.charAt(i)))+over;

            if(nSum[i]>10){
                nSum[i]=nSum[i]-10;
                over=1;
            }else {
                over=0;
            }
        }

        for (int i=nSum.length-1;i>=0;i--){
            System.out.print(nSum[i]);
        }
        System.out.println("");

    }
}
