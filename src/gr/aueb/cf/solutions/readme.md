**Exceptions**  

Αναπτύξτε μία μέθοδο που εμφανίζει ένα μενού με επιλογές από 1 έως 4 (και 5 για Exit) καθώς και μία μέθοδο int getChoice() για να διαβάσετε το choice του χρήστη με Scanner
Ο Scanner να δηλωθεί σε επίπεδο κλάσης.

Στη μέθοδο int getChoice() αν ο χρήστης δώσει μη-ακέραιο ελέγξτε κατάλληλα με state-testing (hasNextInt())
Επίσης, Αν η επιλογή δεν είναι μεταξύ 1-5 τότε δημιουργεί (throws) ένα IllegalArgumentException, το οποίο παρότι είναι RunTimeException, θα μπορούσαμε στη συγκεκριμένη περίπτωση να κάνουμε recover και να κάναμε try/catch στη main.

Αναπτύξτε επίσης μία μέθοδο void printChoice(int choice) που εκτυπώνει την επιλογή. 

Διαμορφώστε τη main ώστε να κάνει catch το exception και να επικοινωνεί με τον χρήστη με κατάλληλο μήνυμα.

Στο πλαίσιο της ενδεικτικής λύσης έχει υλοποιηθεί περαιτέρω και μία μέθοδος log(Exception e) που γράφει σε ένα αρχείο
(log file) ένα timestamp με LocalDateTime.now() καθώς και το message του Exception.

Επίσης, έχει υλοποιηθεί η βοηθητική μέθοδος isValidChoice(int choice)

