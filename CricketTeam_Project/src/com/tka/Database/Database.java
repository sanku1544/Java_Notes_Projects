package com.tka.Database;

import java.util.ArrayList;
import java.util.List;

import com.tka.Players.Players;

public class Database {
		public List<Players> getAllPlayers(){
			List<Players> players = new ArrayList<Players>();

			players.add(new Players(18, "Virat Kohli", 12898, 4, "RCB", "India"));
			players.add(new Players(45, "Rohit Sharma", 10709, 8, "MI", "India"));
			players.add(new Players(7, "MS Dhoni", 4876, 0, "CSK", "India"));
			players.add(new Players(33, "Hardik Pandya", 2309, 53, "MI", "India"));
			players.add(new Players(93, "Jasprit Bumrah", 67, 159, "MI", "India"));
			players.add(new Players(17, "AB de Villiers", 9577, 2, "RCB", "South Africa"));
			players.add(new Players(10, "Sachin Tendulkar", 18426, 154, "MI", "India"));
			players.add(new Players(99, "Ben Stokes", 3150, 197, "RR", "England"));
			players.add(new Players(22, "Kane Williamson", 7124, 37, "SRH", "New Zealand"));
			players.add(new Players(11, "Babar Azam", 5040, 0, "PZ", "Pakistan"));

			players.add(new Players(49, "Steve Smith", 4939, 17, "RR", "Australia"));
			players.add(new Players(55, "David Warner", 6565, 0, "DC", "Australia"));
			players.add(new Players(23, "Shakib Al Hasan", 4600, 312, "KKR", "Bangladesh"));
			players.add(new Players(77, "Rashid Khan", 1234, 515, "GT", "Afghanistan"));
			players.add(new Players(24, "KL Rahul", 4163, 0, "LSG", "India"));
			players.add(new Players(12, "Yuvraj Singh", 8701, 111, "KXIP", "India"));
			players.add(new Players(9, "Chris Gayle", 10480, 167, "RCB", "West Indies"));
			players.add(new Players(30, "Glenn Maxwell", 3390, 72, "RCB", "Australia"));
			players.add(new Players(16, "Joe Root", 6109, 26, "RR", "England"));
			players.add(new Players(25, "Mohammed Shami", 220, 195, "GT", "India"));

			players.add(new Players(90, "Trent Boult", 180, 317, "RR", "New Zealand"));
			players.add(new Players(8, "Ravindra Jadeja", 2692, 152, "CSK", "India"));
			players.add(new Players(13, "Andre Russell", 2262, 210, "KKR", "West Indies"));
			players.add(new Players(6, "Sanju Samson", 3888, 0, "RR", "India"));
			players.add(new Players(41, "Shreyas Iyer", 2776, 0, "KKR", "India"));
			players.add(new Players(27, "Rishabh Pant", 2838, 0, "DC", "India"));
			players.add(new Players(19, "Suryakumar Yadav", 3249, 0, "MI", "India"));
			players.add(new Players(15, "Pat Cummins", 379, 192, "SRH", "Australia"));
			players.add(new Players(21, "Kuldeep Yadav", 128, 173, "DC", "India"));
			players.add(new Players(5, "Mohit Sharma", 52, 115, "GT", "India"));

			players.add(new Players(31, "Ishan Kishan", 2324, 0, "MI", "India"));
			players.add(new Players(32, "Axar Patel", 1350, 111, "DC", "India"));
			players.add(new Players(34, "Ruturaj Gaikwad", 1797, 0, "CSK", "India"));
			players.add(new Players(35, "Devon Conway", 924, 0, "CSK", "New Zealand"));
			players.add(new Players(36, "Jos Buttler", 3223, 0, "RR", "England"));
			players.add(new Players(37, "Jason Holder", 485, 157, "RR", "West Indies"));
			players.add(new Players(38, "Sunil Narine", 1025, 176, "KKR", "West Indies"));
			players.add(new Players(39, "Deepak Chahar", 80, 72, "CSK", "India"));
			players.add(new Players(40, "Arshdeep Singh", 25, 174, "PBKS", "India"));
			players.add(new Players(42, "Umran Malik", 15, 95, "SRH", "India"));

			players.add(new Players(43, "Tilak Varma", 867, 0, "MI", "India"));
			players.add(new Players(44, "Washington Sundar", 727, 38, "SRH", "India"));
			players.add(new Players(46, "Marcus Stoinis", 2104, 89, "LSG", "Australia"));
			players.add(new Players(47, "Quinton de Kock", 2907, 0, "LSG", "South Africa"));
			players.add(new Players(48, "Faf du Plessis", 4031, 0, "RCB", "South Africa"));

			return players;
				

		}
}
