HashSet<String> namesSet = new HashSet(t);
for (int i = 0; i < t; i++) {
	namesSet.add(pair_left[i] + " " + pair_right[i]);
	System.out.println(namesSet.size());
}