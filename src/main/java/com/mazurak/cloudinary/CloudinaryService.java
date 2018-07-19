package com.mazurak.cloudinary;

import org.springframework.web.multipart.MultipartFile;

public interface CloudinaryService {
	
	// URL TO MY PICTURE
	//MultipartFile інтерфейс який дозволяє іменно працювати з файлами , ці всі
	// файли які завагтажубться з форми на бекенд(контроллер) 
	//String path - це шлях за яким буде зберігатися картинка , вона кешується і працює швидко
	String uploadFile(MultipartFile multipartFile, String path);
}
