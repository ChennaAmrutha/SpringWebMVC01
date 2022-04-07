package io.amrutha.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Book {
	private String bookId;
	private String bookName;
	private String bookPrice;
}
