package com.hq.storeFileClient.service.file.apiData;

import org.springframework.web.multipart.MultipartFile;

public class MultipartFileOriginForm {
	private String path;
	private MultipartFile file;

	public static MultipartFileOriginForm newInstance() {
		return new MultipartFileOriginForm();
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

}
