package com.algaworks.brewer.storage;

import com.algaworks.brewer.dto.FotoDTO;
import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.multipart.MultipartFile;

public class FotoStorageRunnable implements Runnable {

    private MultipartFile[] files;
    private DeferredResult<FotoDTO> result;
    private FotoStorage fotoStorage;

    public FotoStorageRunnable(MultipartFile[] files, DeferredResult<FotoDTO> result, FotoStorage fotoStorage) {
        this.files = files;
        this.result = result;
        this.fotoStorage = fotoStorage;
    }

    @Override
    public void run() {
        this.fotoStorage.salvarTemporariamente(files);
        String nomeFoto = files[0].getOriginalFilename();
        String contentType = files[0].getContentType();
        result.setResult(new FotoDTO(nomeFoto, contentType));
    }
}
