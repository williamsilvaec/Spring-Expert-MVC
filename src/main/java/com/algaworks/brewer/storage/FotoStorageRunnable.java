package com.algaworks.brewer.storage;

import com.algaworks.brewer.dto.FotoDTO;
import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.multipart.MultipartFile;

public class FotoStorageRunnable implements Runnable {

    private MultipartFile[] files;
    private DeferredResult<FotoDTO> result;

    public FotoStorageRunnable(MultipartFile[] files, DeferredResult<FotoDTO> result) {
        this.files = files;
        this.result = result;
    }

    @Override
    public void run() {
        System.out.println(">>> files: " + files[0].getSize());
        // TODO: Salvar a foto no sistema de arquivos
        String nomeFoto = files[0].getOriginalFilename();
        String contentType = files[0].getContentType();
        result.setResult(new FotoDTO(nomeFoto, contentType));
    }
}
