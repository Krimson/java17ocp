package lab.bjes.sealed.inheritance;


// Sealed inheritance rules:
// 1: A sealed class need to have permits with at least one class / interface
// 2: Permitted classes need to be in the same package
// 3: A class / interface implementing/extending a sealed class must be "sealed", "non-sealed" or "final"


sealed interface Readable permits Document{ }
sealed class Document implements Readable permits Book, Book2{ }
non-sealed class Book extends Document { }
sealed class Book2 extends Document permits Page {}
non-sealed class Page extends Book2 {}
final class Sentence extends Page {} // Since Page is a non-sealed class instead of final, it can be further extended
final class Journal extends Book{ }
