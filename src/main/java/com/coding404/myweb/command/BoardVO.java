package com.coding404.myweb.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BoardVO {
	
	private int board_num;
	private String board_regdate;
	private String board_id;
	private String board_title;
	private String board_content;
}
