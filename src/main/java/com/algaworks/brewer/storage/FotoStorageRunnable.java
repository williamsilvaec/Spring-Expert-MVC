package com.algaworks.brewer.storage;

import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.multipart.MultipartFile;

public class FotoStorageRunnable implements Runnable {

    private MultipartFile[] files;
    private DeferredResult<String> result;

    public FotoStorageRunnable(MultipartFile[] files, DeferredResult<String> result) {
        this.files = files;
        this.result = result;
    }

    @Override
    public void run() {
        System.out.println(">>> files: " + files[0].getSize());
        // TODO: Salvar a foto no sistema de arquivos
        result.setResult("Ok! foto recebida");
    }
}
