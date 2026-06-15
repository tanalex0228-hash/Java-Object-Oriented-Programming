import org.jfugue.player.Player;
public class week13 {
	public static void main(String[] args) {
		Player p = new Player();
		
		String melody =
				// =====================================================
		        // TEMPO
		        // =====================================================
		        "T168 " +

		        // =====================================================
		        // MELODY
		        // =====================================================
		        "V0 I[Piano] " +

		        // ================= INTRO =================
		        "C5i G4i A4i C5i " +
		        "D5i A4i B4i D5i " +
		        "G5i D5i B4i D5i " +
		        "E5i G5i B5i G5i E5i " +

		        // ================= VERSE 1 =================
		        "Rq " +
		        "D5i D5i B4i C5i " +
		        "D5q B4i B4i G4i A4i " +

		        "B4h Rq " +

		        "B4i A4i G4i A4i " +
		        "B4i A4i G4i " +

		        "E5q D5i B4i B4i C5i " +

		        "D5q G4i G4i B4i A4i G4i A4i " +

		        "B4h Rq " +

		        "B4i A4i G4i A4i " +
		        "B4i D5i E5i F#5i " +

		        // ================= PRE-CHORUS =================
		        "F#5q G5q G5q B4q " +
		        "B4h A4q G4q " +

		        "F#5q G5q G5q B4q " +
		        "B4h A4h " +

		        // ================= CHORUS =================
		        "G5q G5q A5q B5q " +
		        "A5h G5q E5q " +

		        "D5q E5q G5q A5q " +
		        "B5h G5h " +

		        "G5q G5q A5q B5q " +
		        "D6h B5q G5q " +

		        "E5q G5q A5q B5q " +
		        "A5w " +

		        // ================= POST CHORUS =================
		        "Rq " +
		        "G5i A5i B5i A5i G5i E5i " +

		        "D5i E5i G5i A5i " +
		        "B5q G5q " +

		        "E5i G5i A5i B5i " +
		        "A5h G5h " +

		        // ================= VERSE 2 =================
		        "D5i D5i B4i C5i " +
		        "D5q B4i B4i G4i A4i " +

		        "B4h Rq " +

		        "B4i A4i G4i A4i " +
		        "B4i A4i G4i " +

		        "E5q D5i B4i B4i C5i " +

		        "D5q G4i G4i B4i A4i G4i A4i " +

		        "B4h Rq " +

		        "B4i A4i G4i A4i " +
		        "B4i D5i E5i F#5i " +

		        // ================= BUILD-UP =================
		        "G5q A5q B5q D6q " +
		        "E6h D6q B5q " +

		        "A5q B5q D6q E6q " +
		        "G6h E6h " +

		        // ================= FINAL CHORUS =================
		        "G5q G5q A5q B5q " +
		        "D6h B5q G5q " +

		        "E5q G5q A5q B5q " +
		        "D6h E6h " +

		        "G6q E6q D6q B5q " +
		        "A5h G5h " +

		        "E5q G5q A5q B5q " +
		        "A5w " +

		        // ================= OUTRO =================
		        "Rq " +
		        "G5i E5i D5i B4i " +
		        "A4w " +

		        // =====================================================
		        // CHORDS / LEFT HAND
		        // =====================================================
		        "V1 I[Piano] " +

		        // Intro
		        "Cmajw " +
		        "Dmajw " +
		        "Gmajw " +
		        "Eminw " +

		        // Verse 1
		        "Cmajw " +
		        "Dmajw " +
		        "Gmajw " +
		        "Eminw " +

		        "Cmajw " +
		        "Dmajw " +
		        "Gmajw " +
		        "Eminw " +

		        // Pre-Chorus
		        "Cmajw " +
		        "Dmajw " +
		        "Gmajw " +
		        "Eminw " +

		        // Chorus
		        "Cmajw " +
		        "Gmajw " +
		        "Dmajw " +
		        "Eminw " +

		        "Cmajw " +
		        "Gmajw " +
		        "Dmajw " +
		        "Eminw " +

		        // Post Chorus
		        "Cmajw " +
		        "Dmajw " +
		        "Gmajw " +
		        "Eminw " +

		        // Verse 2
		        "Cmajw " +
		        "Dmajw " +
		        "Gmajw " +
		        "Eminw " +

		        "Cmajw " +
		        "Dmajw " +
		        "Gmajw " +
		        "Eminw " +

		        // Build-up
		        "Cmajw " +
		        "Dmajw " +
		        "Eminw " +
		        "Gmajw " +

		        // Final Chorus
		        "Cmajw " +
		        "Gmajw " +
		        "Dmajw " +
		        "Eminw " +

		        "Cmajw " +
		        "Gmajw " +
		        "Dmajw " +
		        "Eminw " +

		        // Outro
		        "Cmajw " +
		        "Gmajw ";


		p.play(melody);
	}

}
