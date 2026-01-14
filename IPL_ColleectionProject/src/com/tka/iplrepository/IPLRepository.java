package com.tka.iplrepository;

import java.util.ArrayList;
import java.util.List;

import com.tka.entity.Player;

public class IPLRepository {

	List<Player> player=null;
	public List<Player> getAllPlayer() {
		//System.out.println("Welcome to IPL Repositroy Module");
		
		player=new ArrayList<>();
		player.add(new Player(1,45, "Rohit Sharma", 341, 2, "MI"));
		player.add(new Player(2,12, "Tim David", 421, 3, "MI"));
		player.add(new Player(3,5, "Tilak Varmaa", 541, 7, "MI"));
		player.add(new Player(4,20, "Suryakumar Yadav", 442, 1, "MI"));
		player.add(new Player(5,17, "Hardik Pandya", 109, 0, "MI"));
		player.add(new Player(6,33, "Mitchel Santner", 121, 4, "MI"));
		player.add(new Player(7,11, "Dipak Chahar", 55, 6, "MI"));
		player.add(new Player(8,07, "Jasprit Bumrah", 11, 9, "MI"));
		player.add(new Player(9,19, "Trent Bolt", 7400, 5, "MI"));
		player.add(new Player(10,10, "Devald Bravis", 234, 0, "MI"));
		player.add(new Player(11,1, "Kiron Pollard", 107, 8, "MI"));

		player.add(new Player(12,74, "Shreyas Iyer", 2776, 0, "KKR"));
		player.add(new Player(13,12, "Andre Russell", 2262, 96, "KKR"));
		player.add(new Player(14,19, "Sunil Narine", 1025, 157, "KKR"));
		player.add(new Player(15,27, "Nitish Rana", 2181, 7, "KKR"));
		player.add(new Player(16,77, "Venkatesh Iyer", 1326, 1, "KKR"));
		player.add(new Player(17,23, "Rinku Singh", 725, 0, "KKR"));
		player.add(new Player(18,14, "Varun Chakravarthy", 24, 83, "KKR"));
		player.add(new Player(19,10, "Pat Cummins", 379, 45, "KKR"));
		player.add(new Player(20,21, "Rahmanullah Gurbaz", 302, 0, "KKR"));
		player.add(new Player(21,8, "Umesh Yadav", 102, 136, "KKR"));
		player.add(new Player(22,11, "Tim Southee", 211, 62, "KKR"));

		player.add(new Player(23,18, "Virat Kohli", 7263, 4, "RCB"));
		player.add(new Player(24,17, "AB de Villiers", 5162, 0, "RCB"));
		player.add(new Player(25,13, "Faf du Plessis", 4133, 0, "RCB"));
		player.add(new Player(26,97, "Glenn Maxwell", 2771, 31, "RCB"));
		player.add(new Player(27,11, "Mohammed Siraj", 0, 83, "RCB"));
		player.add(new Player(28,5, "Dinesh Karthik", 4516, 0, "RCB"));
		player.add(new Player(29,32, "Wanindu Hasaranga", 281, 67, "RCB"));
		player.add(new Player(30,6, "Shahbaz Ahmed", 539, 19, "RCB"));
		player.add(new Player(31,19, "Josh Hazlewood", 55, 83, "RCB"));
		player.add(new Player(32,96, "Harshal Patel", 230, 99, "RCB"));
		player.add(new Player(33,10, "Rajat Patidar", 799, 0, "RCB"));

		player.add(new Player(34,7, "MS Dhoni", 5082, 0, "CSK"));
		player.add(new Player(35,31, "Ruturaj Gaikwad", 1797, 0, "CSK"));
		player.add(new Player(36,8, "Ravindra Jadeja", 2692, 152, "CSK"));
		player.add(new Player(37,90, "Deepak Chahar", 79, 72, "CSK"));
		player.add(new Player(38,18, "Devon Conway", 924, 0, "CSK"));
		player.add(new Player(39,99, "Moeen Ali", 1015, 35, "CSK"));
		player.add(new Player(40,10, "Ambati Rayudu", 4348, 0, "CSK"));
		player.add(new Player(41,55, "Dwayne Bravo", 1560, 183, "CSK"));
		player.add(new Player(42,25, "Shivam Dube", 1103, 4, "CSK"));
		player.add(new Player(43,11, "Mitchell Santner", 103, 15, "CSK"));
		player.add(new Player(44,13, "Matheesha Pathirana", 0, 45, "CSK"));
		
		return player;

	}

}
