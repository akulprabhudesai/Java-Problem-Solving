class UndergroundSystem {

	class Pass {
		int id;
		int StartTime;
		int EndTime;
		String StartStation;
		String EndStation;

		public Pass(int id, String station, int time) {
			this.id = id;
			this.StartStation = station;
			this.StartTime = time;
		}

		public void checkout(String endstation, int time) {
			this.EndStation = endstation;
			this.EndTime = time;
		}
	}

	HashMap<Integer, Pass> in;
	HashMap<String, ArrayList<Pass>> travel;

	public UndergroundSystem() {
		in = new HashMap<Integer, Pass>();
		travel = new HashMap<String, ArrayList<Pass>>();
	}

	public void checkIn(int id, String stationName, int t) {

		Pass cur = new Pass(id, stationName, t);
		in.put(id, cur);
	}

	public void checkOut(int id, String stationName, int t) {

		Pass cur = in.get(id);
		cur.EndStation = stationName;
		cur.EndTime = t;
		String s = cur.StartStation + "." + stationName;
		if (travel.containsKey(s)) {
			travel.get(s).add(cur);
		} else {
			ArrayList<Pass> val = new ArrayList<Pass>();
			val.add(cur);
			travel.put(s, val);
		}
		in.remove(id);
	}

	public double getAverageTime(String startStation, String endStation) {
		double time = 0;
		int c = 0;

		if (travel.containsKey(startStation + "." + endStation)) {
			ArrayList<Pass> pass = travel.get(startStation + "." + endStation);

			for (int i = 0; i < pass.size(); i++) {
				time += (pass.get(i).EndTime - pass.get(i).StartTime);
				c++;
			}
		}

		return (time / c);
	}
}

public class Solution {
	public static void main(String args[]) {

		UndergroundSystem undergroundSystem = new UndergroundSystem();
		undergroundSystem.checkIn(45, "Leyton", 3);
		undergroundSystem.checkIn(32, "Paradise", 8);
		undergroundSystem.checkIn(27, "Leyton", 10);
		undergroundSystem.checkOut(45, "Waterloo", 15);
		undergroundSystem.checkOut(27, "Waterloo", 20);
		undergroundSystem.checkOut(32, "Cambridge", 22);
		System.out.println(undergroundSystem.getAverageTime("Paradise", "Cambridge")); // return 14.00000. There was
																						// only one travel from
																						// "Paradise" (at time 8) to
																						// "Cambridge" (at time 22)
		System.out.println(undergroundSystem.getAverageTime("Leyton", "Waterloo")); // return 11.00000. There were two
																					// travels from "Leyton" to
																					// "Waterloo", a customer with id=45
																					// from time=3 to time=15 and a
																					// customer with id=27 from time=10
																					// to time=20. So the average time
																					// is ( (15-3) + (20-10) ) / 2 =
																					// 11.00000
		undergroundSystem.checkIn(10, "Leyton", 24);
		System.out.println(undergroundSystem.getAverageTime("Leyton", "Waterloo")); // return 11.00000
		undergroundSystem.checkOut(10, "Waterloo", 38);
		System.out.println(undergroundSystem.getAverageTime("Leyton", "Waterloo")); // return 12.00000

	}

}