package com.liumapp.keywordsign.core.keystore;

/**
 * file KeyStore.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/9/4
 */
public interface KeyStore {

    public boolean chkKeyStoreFile (String fileName);

    public void writePfxToKeyStore (String pfxBase64, String certPassword, String alias);


}
