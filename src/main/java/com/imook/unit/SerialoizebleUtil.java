package com.imook.unit;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 * @ClassName SerialoizebleUtil
 */
public class SerialoizebleUtil {
    /**
     * 将对象序列化:要求对象要实现序列化接口
     */
    public static byte[] serialize(Object obj ){
        //对象输出流
        ObjectOutputStream oos = null;
        //字节数组输出流
        ByteArrayOutputStream baos = null;
        byte[] bt=null;
        try {
            baos = new ByteArrayOutputStream();
            oos=new ObjectOutputStream(baos);
            oos.writeObject(obj);
            bt=baos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(baos!=null){
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return bt;
    }
    //反序列化，将byte字节转换为对象
    public static Object unSerialize(byte[] bt){
        ByteArrayInputStream bais = null;
        Object object =null;
        try {
            bais = new ByteArrayInputStream(bt);
            ObjectInputStream ois = new ObjectInputStream(bais);
            object  = ois .readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(bais!=null){
                try {
                    bais.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return object;
    }
}
