package com.idat.Semana_02.controller;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.MediaType;

import org.apache.commons.io.IOUtils;
import com.idat.Semana_02.utilidades.*;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/images")
public class ImageController {

	@PostMapping("/upload")
	@ApiOperation("Cargar Documento")
	public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file){
		if(!file.isEmpty()) {
			try {
				System.out.println(file.getOriginalFilename());
				
				String extensionFile = file.getOriginalFilename().split("\\.")[1];
				utilidades util=new utilidades();
				String result =util.uploadImage(file.getInputStream(), extensionFile);
				return new ResponseEntity<>(result, HttpStatus.OK);
			} catch (Exception e) {
				e.printStackTrace();
				
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			}
		}else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	
	
//	@GetMapping(value = "/view/{filename:.+}", produces =MediaType.IMAGE_JPEG_VALUE)
	@GetMapping(value = "/view/{filename:.+}", produces =MediaType.ALL_VALUE)
	@ApiOperation("Descargar Documento")
	public @ResponseBody byte[] getImage(@PathVariable("filename") String fileName) throws IOException {
		File file = new File("C:\\imagen\\" + fileName);
		InputStream inputStream = new FileInputStream(file);
		return IOUtils.toByteArray(inputStream);
	}
	

	
}
