
public static int sum (String faces, int numRolled) {
    Random rand = new Random(); 
    int numOfFaces = faces.length();
    int randFace = rand.nextInt(numOfFaces);
    int totalSum = 0;
    
    for (int i = 1; i <= numRolled; i++) {
        totalSum += (int) Character.getNumericValue(faces.charAt(randFace));
    }
    
    return totalSum;
}

