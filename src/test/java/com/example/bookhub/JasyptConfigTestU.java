package com.example.bookhub;

import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JasyptConfigTestU {

    @Test
    void stringEncryptor() {
        String url = "db_url";
        String username = "BookHub_Local";
        String password = "dlstkcka1!";

        System.out.println(jasyptEncoding(url));
        System.out.println(":::::   username : "+jasyptEncoding(username));
        System.out.println(":::::   password : "+jasyptEncoding(password));
    }

    public String jasyptEncoding(String value) {

        String key = "han";
        StandardPBEStringEncryptor pbeEnc = new StandardPBEStringEncryptor();
        pbeEnc.setAlgorithm("PBEWithMD5AndDES");
        pbeEnc.setPassword(key);
        return pbeEnc.encrypt(value);
    }


/*###################################################################################*/


}
