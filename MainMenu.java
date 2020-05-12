import java.awt.*;
import javax.swing.*;

public class MainMenu{
    private JFrame frame;

    public MainMenu(){
        this.frame = new JFrame( "Computer Assisted Instruction in Music");
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Lesson 1, 2 horn arrangements
        Slide[] lesson1_slides = new Slide[]{
                new Slide("Images/2 horn, slide 1.png", "Open a new finale or sibelius file."),
                new Slide("Images/2 horn, slide 2.png", "Lock the staff into having four measures per staff."),
                new Slide("Images/2 horn, slide 3.png", "Start by inputting the chord progression above the highest horn part."),
                new Slide("Images/2 horn, slide 4,5.png", "Start by typing in the melody part to the highest of the four horns (make sure to set the horns to display in concert pitch to make your life easier)."),
                new Slide("Images/2 horn, slide 4,5.png", "If the melody isn’t predetermined/you have to write it yourself, stick to the easy rule: write the rhythms first using simple rhythms, then add melody notes that are mostly in the chord, and again, KEEP IT SIMPLE."),
                new Slide("Images/2 horn, slide 6.png", "After this is complete, copy and past the melody onto the second highest horn part."),
                new Slide("Images/2 horn, slide 7,8.png", "Use the transpose tool to move the second horn part DOWN A THIRD or DOWN A SIXTH from the highest part."),
                new Slide("Images/2 horn, slide 7,8.png", "If needed, pull up a chord diagram on google that contains a list of all seventh chords and the notes contained in them."),
                new Slide("Images/2 horn, slide 9.png", "Once this is done, now make sure wherever there is a chord tone in the highest horn part, there is the next lowest chord tone in the part below it, and when there is a non-chord tone in the highest horn part, there is a non-chord tone in the part below it. (Ex., if the chord is Gbmaj7 and the highest part has an F, make the next horn part a Db) "),
                new Slide("Images/2 horn, slide 10.png", "Generally for non chord tones, just look at the shape of the highest part and try to match that shape (Ex., if the chord is F6 and the melody is F E D C, make the next lowest part D Db C A)."),
                new Slide("Images/2 horn, slide 11,12.png", "As a general note, the rule is to treat maj7 as maj6 chords and minmaj7 as min6 chords."),
                new Slide("Images/2 horn, slide 11,12.png", "The goal is to have the lower horn part have the same basic “arc” as the highest part, so make sure that the other part looks similar (ex. If the melody has an arpeggio that is E F A C E D, the corresponding lower parts should follow the basic shape of ascending a second, ascending a third, ascending a third,  ascending a third, and descending a second)."),
        };
        SlideShow lesson1 = new SlideShow("2 Horn Arrangements", lesson1_slides);
        MenuButton lesson1_button = new MenuButton(lesson1);
        this.frame.add(lesson1_button);

        //Lesson 2, 3 horn arrangements
        Slide[] lesson2_slides = new Slide[]{
                new Slide("Images/3 horn, slide 1.png", "Open a new finale or sibelius file."),
                new Slide("Images/3 horn, slide 2.png", "Start by locking the staves into having four measures per staff."),
                new Slide("Images/3 horn, slide 3.png", "Input the chord progression above the highest horn part."),
                new Slide("Images/3 horn, slide 4:5.png", "Start by typing in the melody part to the highest of the three horns (Make sure to set the horns to display in concert pitch to make your life easier)."),
                new Slide("Images/3 horn, slide 4:5.png", "If the melody isn’t predetermined/you have to write it yourself, stick to the easy rule: write the rhythms first using simple rhythms, then add melody notes that are mostly in the chord, and again, KEEP IT SIMPLE."),
                new Slide("Images/3 horn, slide 6:7:8.png", "After this is complete, copy and past the melody onto the second highest horn part."),
                new Slide("Images/3 horn, slide 6:7:8.png", "Use the transpose tool to move the second horn part DOWN A THIRD or DOWN A SIXTH from the highest part."),
                new Slide("Images/3 horn, slide 6:7:8.png", "If needed, pull up a chord diagram on google that contains a list of all seventh chords and the notes contained in them."),
                new Slide("Images/3 horn, slide 9:10.png", "Once this is done, now make sure wherever there is a chord tone in the highest horn part, there is the next lowest chord tone in the part below it, and when there is a non-chord tone in the highest horn part, there is a non-chord tone in the part below it. (Ex., if the chord is Gbmaj7 and the highest part has an F, make the next horn part a Db) "),
                new Slide("Images/3 horn, slide 9:10.png", "Generally for non chord tones, just look at the shape of the highest part and try to match that shape (Ex., if the chord is F6 and the melody is F E D C, make the next lowest part D Db C A)."),
                new Slide("Images/3 horn, slide 11.png", "After you’ve gone through the whole second highest part and made all of the correct adjustments, repeat the same process for the third part."),
                new Slide("Images/3 horn, slide 12.png", "If you’re unsure that every chord tone in the highest part has chord tones in the lower parts and that every non chord tone has non chord tones in the lower parts, you can look up a chord diagram for seventh chords that should list the contents of any given seventh chord."),
                new Slide("Images/3 horn, slide 13:14.png", "As a general note, the rule is to treat maj7 as maj6 chords and minmaj7 as min6 chords."),
                new Slide("Images/3 horn, slide 13:14.png", "The goal is to have the lower horn part have the same basic “arc” as the highest part, so make sure that the other part looks similar (ex. If the melody has an arpeggio that is E F A C E D, the corresponding lower parts should follow the basic shape of ascending a second, ascending a third, ascending a third,  ascending a third, and descending a second)."),
        };
        SlideShow lesson2 = new SlideShow("3 Horn Arrangements", lesson2_slides);
        MenuButton lesson2_button = new MenuButton(lesson2);
        this.frame.add(lesson2_button);

        //Lesson 3, 4 horn arrangements
        Slide[] lesson3_slides = new Slide[]{
                new Slide("Images/4 horn, slide 1.png", "Open a new finale or sibelius file."),
                new Slide("Images/4 horn, slide 2.png", "Start by locking the staves into having four measures per staff."),
                new Slide("Images/4 horn, slide 3.png", "Input the chord progression above the highest horn part."),
                new Slide("Images/4 horn, slide 4,5.png", "Start by typing in the melody part to the highest of the four horns (Make sure to set the horns to display in concert pitch to make your life easier)."),
                new Slide("Images/4 horn, slide 4,5.png", "If the melody isn’t predetermined/you have to write it yourself, stick to the easy rule: write the rhythms first using simple rhythms, then add melody notes that are mostly in the chord, and again, KEEP IT SIMPLE."),
                new Slide("Images/4 horn, slide 6,7.png", "After this is complete, copy and past the melody onto the second highest horn part."),
                new Slide("Images/4 horn, slide 6,7.png", "Use the transpose tool to move the second horn part DOWN A THIRD or DOWN A SIXTH from the highest part."),
                new Slide("Images/4 horn, slide 8.png", "If needed, pull up a chord diagram on google that contains a list of all seventh chords and the notes contained in them."),
                new Slide("Images/4 horn, slide 9,10.png", "Once this is done, now make sure wherever there is a chord tone in the highest horn part, there is the next lowest chord tone in the part below it, and when there is a non-chord tone in the highest horn part, there is a non-chord tone in the part below it. (Ex., if the chord is Gbmaj7 and the highest part has an F, make the next horn part a Db) "),
                new Slide("Images/4 horn, slide 9,10.png", "Generally for non chord tones, just look at the shape of the highest part and try to match that shape (Ex., if the chord is F6 and the melody is F E D C, make the next lowest part D Db C A)."),
                new Slide("Images/4 horn, slide 11,12.png", "After you’ve gone through the whole second highest part and made all of the correct adjustments, repeat the same process for the third and fourth parts."),
                new Slide("Images/4 horn, slide 11,12.png", "By the end, for any given chord tone in the melody, there should be all four notes of a seventh chord being covered by each one of the horns."),
                new Slide("Images/4 horn, slide 13,14,15.png", "If you’re unsure that every chord tone in the highest part has chord tones in the lower parts and that every non chord tone has non chord tones in the lower parts, you can look up a chord diagram for seventh chords that should list the contents of any given seventh chord."),
                new Slide("Images/4 horn, slide 13,14,15.png", "As a general note, the rule is to treat maj7 as maj6 chords and minmaj7 as min6 chords."),
                new Slide("Images/4 horn, slide 13,14,15.png", "The goal is to have the lower horn part have the same basic “arc” as the highest part, so make sure that the other part looks similar (ex. If the melody has an arpeggio that is E F A C E D, the corresponding lower parts should follow the basic shape of ascending a second, ascending a third, ascending a third,  ascending a third, and descending a second)."),
        };
        SlideShow lesson3 = new SlideShow("4 Horn Arrangements", lesson3_slides);
        MenuButton lesson3_button = new MenuButton(lesson3);
        this.frame.add(lesson3_button);

        //Lesson 4, 5 horn arrangements
        Slide[] lesson4_slides = new Slide[]{
                new Slide("Images/5 horn, slide 1.png", "Open a new finale or sibelius file."),
                new Slide("Images/5 horn, slide 2.png", "Start by locking the staves into having four measures per staff."),
                new Slide("Images/5 horn, slide 3,4,5.png", "Input the chord progression above the highest horn part."),
                new Slide("Images/5 horn, slide 3,4,5.png", "Start by typing in the melody part to the highest of the four horns (Make sure to set the horns to display in concert pitch to make your life easier)."),
                new Slide("Images/5 horn, slide 3,4,5.png", "If the melody isn’t predetermined/you have to write it yourself, stick to the easy rule: write the rhythms first using simple rhythms, then add melody notes that are mostly in the chord, and again, KEEP IT SIMPLE."),
                new Slide("Images/5 horn, slide 6.png", "After this is complete, copy and paste the highest part into the lowest part, and transpose it down an octave (they should end up being identical except for being an octave lower)"),
                new Slide("Images/5 horn, slide 7.png", "After this is complete, copy and past the melody onto the second highest horn part."),
                new Slide("Images/5 horn, slide 8.png", "Use the transpose tool to move the second horn part DOWN A THIRD from the highest part."),
                new Slide("Images/5 horn, slide 9,10,11.png", "If needed, pull up a chord diagram on google that contains a list of all seventh chords and the notes contained in them."),
                new Slide("Images/5 horn, slide 9,10,11.png", "Once this is done, now make sure wherever there is a chord tone in the highest horn part, there is the next lowest chord tone in the part below it, and when there is a non-chord tone in the highest horn part, there is a non-chord tone in the part below it. (Ex., if the chord is Gbmaj7 and the highest part has an F, make the next horn part a Db) "),
                new Slide("Images/5 horn, slide 9,10,11.png", "Generally for non chord tones, just look at the shape of the highest part and try to match that shape (Ex., if the chord is F6 and the melody is F E D C, make the next lowest part D Db C A)."),
                new Slide("Images/5 horn, slide 12,13.png", "After you’ve gone through the whole second highest part and made all of the correct adjustments, repeat the process for the third and fourth parts."),
                new Slide("Images/5 horn, slide 12,13.png", "By the end, for any given chord tone in the melody, there should be all four notes of a seventh chord being covered by each one of the horns."),
                new Slide("Images/5 horn, slide 14,15,16.png", "If you’re unsure that every chord tone in the highest part has chord tones in the lower parts and that every non chord tone has non chord tones in the lower parts, you can look up a chord diagram for seventh chords that should list the contents of any given seventh chord."),
                new Slide("Images/5 horn, slide 14,15,16.png", "As a general note, the rule is to treat maj7 as maj6 chords and minmaj7 as min6 chords."),
                new Slide("Images/5 horn, slide 14,15,16.png", "The goal is to have the lower horn part have the same basic “arc” as the highest part, so make sure that the other part looks similar (ex. If the melody has an arpeggio that is E F A C E D, the corresponding lower parts should follow the basic shape of ascending a second, ascending a third, ascending a third,  ascending a third, and descending a second)."),
        };
        SlideShow lesson4 = new SlideShow("5 Horn Arrangements (Soli Writing)", lesson4_slides);
        MenuButton lesson4_button = new MenuButton(lesson4);
        this.frame.add(lesson4_button);

        //lesson 5, backgrounds
        Slide[] lesson5_slides = new Slide[]{
                new Slide("Images/Backgrounds, slide 1-6.png", "When arranging, one will find there are some many different ways to create backgrounds with various combinations of instruments."),
                new Slide("Images/Backgrounds, slide 1-6.png", "In big band jazz, generally you’ll find a whole section doing backgrounds together (all the saxophones, all the brass, etc.)"),
                new Slide("Images/Backgrounds, slide 1-6.png", "In some styles like funk or pop, you might find three horns doing backgrounds together (like trumpet, tenor saxophone, and trombone for instance)"),
                new Slide("Images/Backgrounds, slide 1-6.png", "Regardless of style, the principle is the same, which is generally to add something to the texture that adds momentum to a song but doesn’t take attention away from the melody too much."),
                new Slide("Images/Backgrounds, slide 1-6.png", "Generally this is achieved by having all of the instruments playing a unison rhythm (generally half and whole notes with some rhythmic variation) playing notes of the chord."),
                new Slide("Images/Backgrounds, slide 1-6.png", "This is sometimes a good place to add colorful chord voicings, like chords with extensions."),
                new Slide("Images/Backgrounds, slide 7.png", "In this example, we’ll use backgrounds on a jazz tune called “Bag’s Groove”"),
                new Slide("Images/Backgrounds, slide 8-9.png", "What I did here was have the highest trombone part play the trumpet melody notes as half notes so it doesn’t conflict with the melody at all, but makes it work well together."),
                new Slide("Images/Backgrounds, slide 8-9.png", "After that, the goal is to find what notes in each chord would harmonize the melody notes well. "),
                new Slide("Images/Backgrounds, slide 10.png", "A good rule of thumb for harmonizing a melody in this style is that if the melody note is the 1, 3, 5, or 7, make the other parts be 1, 3, 5, or 7."),
                new Slide("Images/Backgrounds, slide 11.png", "If the melody note is an extension (9, 11, 13, or an altered tone), generally it’s a good rule of thumb to make the lowest two parts play 1 and 3, 1 and 5, 1 and 7, or 3 and 7, while the second to highest part plays an extension that the melody isn’t playing."),
                new Slide("Images/Backgrounds, slide 12.png", "Do your best to make each part sound like it’s own little melody, but not at the cost of the whole song being incohesive. "),
        };
        SlideShow lesson5 = new SlideShow("Backgrounds", lesson5_slides);
        MenuButton lesson5_button = new MenuButton(lesson5);
        this.frame.add(lesson5_button);

        //lesson 6, chord building
        Slide[] lesson6_slides = new Slide[]{
                new Slide("Images/Chord Building, slide 1-2.png", "When arranging, one will find there are some many different ways to create backgrounds with various combinations of instruments. "),
                new Slide("Images/Chord Building, slide 1-2.png", "In big band jazz, generally you’ll find a whole section doing backgrounds together (all the saxophones, all the brass, etc.)"),
                new Slide("Images/Chord Building, slide 3-4.png", "In some styles like funk or pop, you might find three horns doing backgrounds together (like trumpet, tenor saxophone, and trombone for instance)"),
                new Slide("Images/Chord Building, slide 3-4.png", "Regardless of style, the principle is the same, which is generally to add something to the texture that adds momentum to a song but doesn’t take attention away from the melody too much."),
                new Slide("Images/Chord Building, slide 5.png", "Generally this is achieved by having all of the instruments playing a unison rhythm (generally half and whole notes with some rhythmic variation) playing notes of the chord."),
                new Slide("Images/Chord Building, slide 6-7.png", "This is sometimes a good place to add colorful chord voicings, like chords with extensions."),
                new Slide("Images/Chord Building, slide 6-7.png", "Use the transpose tool to move the second horn part DOWN A THIRD or DOWN A SIXTH from the highest part."),
                new Slide("Images/Chord Building, slide 8.png", "If needed, pull up a chord diagram on google that contains a list of all seventh chords and the notes contained in them."),
                new Slide("Images/Chord Building, slide 9.png", "Once this is done, now make sure wherever there is a chord tone in the highest horn part, there is the next lowest chord tone in the part below it, and when there is a non-chord tone in the highest horn part, there is a non-chord tone in the part below it. (Ex., if the chord is Gbmaj7 and the highest part has an F, make the next horn part a Db) "),
                new Slide("Images/Chord Building, slide 10.png", "Generally for non chord tones, just look at the shape of the highest part and try to match that shape (Ex., if the chord is F6 and the melody is F E D C, make the next lowest part D Db C A)."),
                new Slide("Images/Chord Building, slide 11.png", "After you’ve gone through the whole second highest part and made all of the correct adjustments, repeat the same process for the third and fourth parts."),
                new Slide("Images/Chord Building, slide 12.png", "By the end, for any given chord tone in the melody, there should be all four notes of a seventh chord being covered by each one of the horns."),
                new Slide("Images/Chord Building, slide 13.png", "After you’ve gone through the whole second highest part and made all of the correct adjustments, repeat the same process for the third and fourth parts."),
                new Slide("Images/Chord Building, slide 14.png", "By the end, for any given chord tone in the melody, there should be all four notes of a seventh chord being covered by each one of the horns."),
        };
        SlideShow lesson6 = new SlideShow("Chord Building", lesson6_slides);
        MenuButton lesson6_button = new MenuButton(lesson6);
        this.frame.add(lesson6_button);

        //lesson 7, chord progressions
        Slide[] lesson7_slides = new Slide[]{
                new Slide("Images/Chord Progressions, slide 1.png", "Unlike understanding chord construction and chord voicings, which allows us to understand an individual chord and its components, understanding chord progressions allows us to see how one chord relates to another."),
                new Slide("Images/Chord Progressions, slide 2-3.png", "Even though chord progressions can get complicated, many start from a basic formula which is called The Number System, Roman Numeral Analysis, etc. which just tells you the root of a chord in a key and it’s quality (whether it’s major, minor, diminished, etc.)"),
                new Slide("Images/Chord Progressions, slide 2-3.png", "Say we are in the key of C, which contains the notes C D E F G A B"),
                new Slide("Images/Chord Progressions, slide 4.png", "If we gave each note a corresponding number 1 2 3 4 5 6 7, or in roman numerals, I ii iii IV V vi vii, and just stack thirds up from each chord, we get the number system."),
                new Slide("Images/Chord Progressions, slide 5.png", "That means if someone tells you “the chords to this song are 2 5 1 4 in C major”, we can deduce very quickly that the chords are D minor, G major, C major, and F major."),
                new Slide("Images/Chord Progressions, slide 6.png", "That means if someone tells you “the chords to this song are 2 5 1 4 in C major”, we can deduce very quickly that the chords are D minor, G major, C major, and F major"),
                new Slide("Images/Chord Progressions, slide 7-8.png", "If a chord is being played that isn’t naturally in the key (say and Ab major chord in the key of C major), we would relate to the closest chord right above it, which would be a flat 6 major (b6)  chord in C major."),
                new Slide("Images/Chord Progressions, slide 7-8.png", "This system is how musicians normally communicate chord progressions and how one can analyze songs to learn things from them. Normally, when analyzing songs, people use roman numerals to indicate which chord is which."),
                new Slide("Images/Chord Progressions, slide 9.png", "There are chord progressions that are so common they’re worth memorizing. These include: 2 5 1"),
                new Slide("Images/Chord Progressions, slide 10.png", "1 6 2 5"),
                new Slide("Images/Chord Progressions, slide 11.png", "1 6 4 5 (and any permutation of 1645)"),
                new Slide("Images/Chord Progressions, slide 12.png", "and 3 6 2 5"),
        };
        SlideShow lesson7 = new SlideShow("Chord Progressions", lesson7_slides);
        MenuButton lesson7_button = new MenuButton(lesson7);
        this.frame.add(lesson7_button);

        //lesson 8, chord voicings
        Slide[] lesson8_slides = new Slide[]{
                new Slide("Images/Chord Voicings, slide 1-2.png", "For any given chord, once you know what notes are in it, one has to decide what order they’re going to combine the notes in order to actually use it."),
                new Slide("Images/Chord Voicings, slide 1-2.png", "The specific arrangement of notes in a chord is called a chord voicing."),
                new Slide("Images/Chord Voicings, slide 3-4.png", "For triads, you have closed voicings (or voicings where all of the notes are in one octave or less) or spread voicings (where one note in a closed voicing chord is raised or lowered an octave)."),
                new Slide("Images/Chord Voicings, slide 3-4.png", "This isn’t an exhaustive list, but these are definitely the most common two options."),
                new Slide("Images/Chord Voicings, slide 5-6.png", "For seventh chords, since there are four notes instead of three, there are a few more options."),
                new Slide("Images/Chord Voicings, slide 5-6.png", "First, we have closed voicings, or voicings where all of the notes are contained within one octave. "),
                new Slide("Images/Chord Voicings, slide 7-8.png", "After that, we have “drop voicings”, where one note in the chord is lowered an octave."),
                new Slide("Images/Chord Voicings, slide 7-8.png", "The most common drop voicings are Drop two, Drop three, and drop two four voicings."),
                new Slide("Images/Chord Voicings, slide 9.png", "Drop two means drop the second note from the top of the chord down an octave, Drop three means drop the third note from the top of the chord down an octave, etc. "),
                new Slide("Images/Chord Voicings, slide 10.png", "Drop two means drop the second note from the top of the chord down an octave, Drop three means drop the third note from the top of the chord down an octave, etc."),
                new Slide("Images/Chord Voicings, slide 11-12.png", "Drop two means drop the second note from the top of the chord down an octave, Drop three means drop the third note from the top of the chord down an octave, etc."),
                new Slide("Images/Chord Voicings, slide 11-12.png", "Again, this list isn’t exhaustive, but these are by far the most common voicings. "),
                new Slide("Images/Chord Voicings, slide 13-14.png", "For extended chords like 9th, 11th, and 13th chords, there are significantly more options. "),
                new Slide("Images/Chord Voicings, slide 13-14.png", "Mostly, they involve OMITTING notes rather than rearranging notes in a chord. "),
                new Slide("Images/Chord Voicings, slide 15.png", "For instance, a major 9th chord is frequently voiced C E B D, which is just the normal chord but with no fifth."),
                new Slide("Images/Chord Voicings, slide 16.png", "As a rule of thumb, you can simply spell these extended chords out like one normally would, and exclude the fifth, root, or third of a chord."),
        };
        SlideShow lesson8 = new SlideShow("Chord Voicings", lesson8_slides);
        MenuButton lesson8_button = new MenuButton(lesson8);
        this.frame.add(lesson8_button);

        //lesson 9, circle of fourths
        Slide[] lesson9_slides = new Slide[]{
                new Slide("Images/Circle of Fourths, slide 1.png", "Understanding the circle of fourths is borderline essential to understanding almost every overarching idea of harmony and melody in music. "),
                new Slide("Images/Circle of Fourths, slide 2-3.png", "In its most basic form though, you simply must remember a pattern: B E A D G C F"),
                new Slide("Images/Circle of Fourths, slide 2-3.png", "You can come up with sayings or mnemonic devices to remember it, but you HAVE to memorize this pattern (ex. But Elvin Always Does Give Comforting Fills or whatever works for you specifically)"),
                new Slide("Images/Circle of Fourths, slide 4-5.png", "To remember the whole Circle of Fourths, just remember B E A D G C F, then put a flat in front of the first five and repeat them, making the whole thing B E A D G C F Bb Eb Ab Db Gb"),
                new Slide("Images/Circle of Fourths, slide 4-5.png", "This pattern is how chord progressions evolve almost everywhere in music, and there’s a good reason for that."),
                new Slide("Images/Circle of Fourths, slide 6.png", "It actually is part of a physical phenomenon in physics called the overtone series, which shows that any sound in nature has overtones that are multiples of the fundamental (ex. If a frequency is 100 Hz, the first overtone will be 200 Hz, then the next 300, etc.)"),
                new Slide("Images/Circle of Fourths, slide 7-8.png", "In simpler terms, any note that’s played has higher notes happening simultaneously, and how present each overtone is in the original note is what gives an instrument it’s sound."),
                new Slide("Images/Circle of Fourths, slide 7-8.png", "This explains why a flute playing the note C sounds different then a piano playing C or why my speaking voice sounds different than your speaking voice, because they all contain different amounts of overtones (or harmonics)"),
                new Slide("Images/Circle of Fourths, slide 9-11.png", "This relates to the circle of fourths because the first overtone is an octave above the original note, but the second overtone is an octave and fifth above the original note. "),
                new Slide("Images/Circle of Fourths, slide 9-11.png", "This is important because a fifth is naturally occuring in every sound that happens in real life, everytime."),
                new Slide("Images/Circle of Fourths, slide 9-11.png", "Since going up a fourth from a note is the same thing as going down a fifth from a note (going up a fourth from B is E, and going down a fifth from B is E), fourths sound incredibly natural. "),
                new Slide("Images/Circle of Fourths, slide 12.png", "If you play any two major chords that are next to each other on the circle of fourths, they’ll sound very natural, because of the overtone series"),
                new Slide("Images/Circle of Fourths, slide 13.png", "This is why one of the most common chord progressions in all of western music, the ii-V-I, works so well. "),
                new Slide("Images/Circle of Fourths, slide 14-15.png", "Say for instance we were in the key of C, the ii-V-I in that key would be Dmin, Gmaj, and Cmaj. D-G-C are all next to each other in the circle of fourths."),
                new Slide("Images/Circle of Fourths, slide 14-15.png", "If you can understand these patterns, understanding why good melodies, bass lines, and chord progressions sound good will make a lot more sense."),
        };
        SlideShow lesson9 = new SlideShow("Circle of Fourths", lesson9_slides);
        MenuButton lesson9_button = new MenuButton(lesson9);
        this.frame.add(lesson9_button);

        //lesson 10, Full big band voicings
        Slide[] lesson10_slides = new Slide[]{
                new Slide("Images/Full Big Band Voicings, slide 1-3.png", "It can be pretty daunting to arrange music for 13 different horn parts by yourself, even if you’re a horn player yourself, so here are a few techniques to make life easier."),
                new Slide("Images/Full Big Band Voicings, slide 1-3.png", "For any given chord, try this rule:"),
                new Slide("Images/Full Big Band Voicings, slide 1-3.png", "First, decide on the rhythm that the whole band is playing before even writing a note"),
                new Slide("Images/Full Big Band Voicings, slide 4.png", "After that, have the trombones cover the 1, 3, 5, and 7 in some form or fashion (a good 1 5 3 7, 1 5 7 3, or just 1 3 5 7 will do the trick)"),
                new Slide("Images/Full Big Band Voicings, slide 5-6.png", "Next, have the trumpets play the extensions of the chord in the form of an upper structure triad."),
                new Slide("Images/Full Big Band Voicings, slide 5-6.png", "This basically just means on a given chord, use the triad that’s formed by the 9th, 11th, and 13th, and put each one of those notes in the 1st, 2nd, and 3rd trumpets, then have the 4th trumpet double the 1st trumpet down on octave. (Ex. if the chord was Dbmaj7, use the extensions Eb, G, and Bb, and a possible voicing from bottom up could be Eb, G, Bb, Eb)"),
                new Slide("Images/Full Big Band Voicings, slide 7.png", "Lastly, have the bari sax double the 4th trombone part, then have the two tenors and altos either play the top three trombone parts and lowest trumpet part, or the top two trombone parts and lower two trumpet parts."),
                new Slide("Images/Full Big Band Voicings, slide 8.png", "This works literally every time and saves a lot of guess and check time."),

        };
        SlideShow lesson10 = new SlideShow("Full Big Band Voicings", lesson10_slides);
        MenuButton lesson10_button = new MenuButton(lesson10);
        this.frame.add(lesson10_button);

        //lesson 11, how to use finale
        Slide[] lesson11_slides = new Slide[]{
                new Slide("Images/How to Use Finale, slide 1.png", "Even though Finale can be used very indepthly, there are only a handful of tools that are needed to get almost everything done that’s needed."),
                new Slide("Images/How to Use Finale, slide 2.png", "Upon opening the application and launching a new project, you’ll put in a lot of information in the Setup Wizard that will help later (key signature, tempo, time signature, instrumentation, etc.)"),
                new Slide("Images/How to Use Finale, slide 3.png", "After doing this, the main goals are pretty straight forward: input in the correct notes, chords, and lyrics as efficiently as possible. "),
                new Slide("Images/How to Use Finale, slide 4.png", "The easiest way to input notes is to use the speedy entry tool, which relies heavily on shortcuts."),
                new Slide("Images/How to Use Finale, slide 5-6.png", "There’s a list of each command for each type of note online. "),
                new Slide("Images/How to Use Finale, slide 5-6.png", "You may find that you need to input things like rehearsal markings, dynamics, tempo changes, etc. "),
                new Slide("Images/How to Use Finale, slide 7.png", "To do these things, right click on the note closest to where you want these things to happen, which will prompt to pick “Add expression”."),
                new Slide("Images/How to Use Finale, slide 8.png", "This will lead you to be able to select if you’d like to add any of the aforementioned things."),
                new Slide("Images/How to Use Finale, slide 9.png", "To add articulations, go to a note and right click to select the option “Add articulation”  and that will appear too."),
                new Slide("Images/How to Use Finale, slide 10.png", "Once notes are inputted, adding chords and lyrics is pretty straight forward. Just use the lyric or chord tools and input chords above the staff and lyrics below the staff."),
                new Slide("Images/How to Use Finale, slide 11-12.png", "Some operations that aren’t very self explanatory are locking certain amounts of measures in a staff, displaying transposing instruments in concert pitch, and transposing instrument parts."),
                new Slide("Images/How to Use Finale, slide 11-12.png", "To lock certain numbers of measures to staff, highlight the measures you’d like to be locked and go to utilities, then press “Fit Measures”. Then select “Lock selected measures into one system”."),
                new Slide("Images/How to Use Finale, slide 13.png", "To display transposing instruments into concert pitch, simply go to “Document” and select “Display in concert pitch”"),
                new Slide("Images/How to Use Finale, slide 14.png", "To transpose a part, highlight the part you want transposed, right click, select transpose, and specify the amount higher or lower you want a part."),
                new Slide("Images/How to Use Finale, slide 15.png", "To add different types of repeats, select the measure(s) you need repeats for, right click, choose “Repeats”, and select the desired option and if it’s not there, go to repeat selection."),
        };
        SlideShow lesson11 = new SlideShow("How to Use Finale", lesson11_slides);
        MenuButton lesson11_button = new MenuButton(lesson11);
        this.frame.add(lesson11_button);

        //lesson 12, keys
        Slide[] lesson12_slides = new Slide[]{
                new Slide("Images/Keys, slide 1-3.png", "Knowing what key a song is in makes so many elements of music easier, it lets you know what everything revolves around per se."),
                new Slide("Images/Keys, slide 1-3.png", "In a nutshell, a key or key center is just an emphasis around a certain note and putting other notes around it."),
                new Slide("Images/Keys, slide 1-3.png", "Generally, a song can be in a major or minor key, and each one has different corresponding notes to go with it."),
                new Slide("Images/Keys, slide 4.png", "A major key means that there is a major third in the key (or a there is a note in the scale that is four half steps above the key center) (ex. In the key of C major, the major third is E)"),
                new Slide("Images/Keys, slide 5.png", "In addition to having a major third, most commonly a major key has a major second(two half steps above the key center), perfect fourth (5 half steps) , perfect fifth(7 half steps), major sixth(9 half steps), and a major 7th(11 half steps)."),
                new Slide("Images/Keys, slide 6.png", "An easier way to think about it is WWHWWWH, or whole whole half whole whole whole half, meaning whole steps (two notes next to each other on a keyboard) and half steps(directly next to each other)."),
                new Slide("Images/Keys, slide 7.png", "The clearest example of a key is in C major, because it happens to be only the white keys."),
                new Slide("Images/Keys, slide 8.png", "A minor key means the key has a minor third (or three half steps above the root or key center)."),
                new Slide("Images/Keys, slide 9.png", "In addition to a minor third, normally a minor key contains a major second(two half steps), perfect fourth(five half steps), perfect fifth(seven half steps), minor sixth(eight half steps), and minor seventh(ten half steps)."),
                new Slide("Images/Keys, slide 10-11.png", "An easier way to think about this is WHWWHWW."),
                new Slide("Images/Keys, slide 10-11.png", "The clearest example of this is A minor, because it happens to be only white keys."),
                new Slide("Images/Keys, slide 12-13.png", "As you might’ve noticed, if C major and A minor are both only white keys, then it means they both contain the same notes."),
                new Slide("Images/Keys, slide 12-13.png", "In fact, every major key has a minor key that shares the exact same notes. These are called relative major/minor keys."),
                new Slide("Images/Keys, slide 14-15.png", "Say for instance we wanted to find out the notes in D major."),
                new Slide("Images/Keys, slide 14-15.png", "We would start on D and do the pattern WWHWWWH. (USE A KEYBOARD OR PICTURE OF A KEYBOARD TO VISUALIZE THE INTERVALS)"),
                new Slide("Images/Keys, slide 16.png", "Once completed, you’ll see the notes are D E F# G A B C#"),
                new Slide("Images/Keys, slide 17-18.png", "Rather than spelling all seven notes out every time you want to think about the key of D major, you can just put two sharps on the F and C line and space at the beginning of a piece of sheet music. This is the key signature."),
                new Slide("Images/Keys, slide 17-18.png", "Every given key has a unique number of flats or sharps in it, so each key has a unique key signature."),
                new Slide("Images/Keys, slide 19.png", "Here’s a list of key signatures."),
        };
        SlideShow lesson12 = new SlideShow("Keys", lesson12_slides);
        MenuButton lesson12_button = new MenuButton(lesson12);
        this.frame.add(lesson12_button);

        //lesson 13, scales
        Slide[] lesson13_slides = new Slide[]{
                new Slide("Images/Scales, slide 1-3.png", "When learning about keys, we talked about major and minor keys, and we used the formulas WWHWWWH and WHWWHWW to create these two keys. Well, these were the first taste of scales, the major and natural minor scales."),
                new Slide("Images/Scales, slide 1-3.png", "A scale is just any collection of notes really, but it’s generally five or more notes."),
                new Slide("Images/Scales, slide 1-3.png", "Most scales use seven notes in western music, and the major and natural minor scales are two of the most common."),
                new Slide("Images/Scales, slide 4.png", "Most scales use the major scale as the basis for describing them, so we rename WWHWWWH as just the formula 1 2 3 4 5 6 7"),
                new Slide("Images/Scales, slide 5.png", "Relative to this, the natural minor scales 1 2 b3 4 5 b6 b7"),
                new Slide("Images/Scales, slide 6-8.png", "By far, the most common scales western music deals with are as follows:"),
                new Slide("Images/Scales, slide 6-8.png", "With C as a root, those scales would be:"),
                new Slide("Images/Scales, slide 6-8.png", "There many (hundreds really of) different scales that exist, but most of which are never used even in complex styles of music."),
                new Slide("Images/Scales, slide 9.png", "There are scales with less than seven notes like the major pentatonic scale(1 2 3 5 6) "),
                new Slide("Images/Scales, slide 10.png", "There are scales with more than seven notes like the W-H diminished scale (1 2 b3 4 b5 b6 6 7)"),

        };
        SlideShow lesson13 = new SlideShow("Scales", lesson13_slides);
        MenuButton lesson13_button = new MenuButton(lesson13);
        this.frame.add(lesson13_button);

        //lesson 14, Sheet music
        Slide[] lesson14_slides = new Slide[]{
                new Slide("Images/Sheet Music, slide 1.png", "The first thing to start with is identify a few elements: the staff, the clef, the time signature, and the key signature"),
                new Slide("Images/Sheet Music, slide 2.png", "The staff is just five lines and two spaces, and each space and line determines a letter note name."),
                new Slide("Images/Sheet Music, slide 3.png", "There are commonly two clefs, the treble clef and bass clef."),
                new Slide("Images/Sheet Music, slide 4.png", "The treble clef indicates that the note in the middle of it’s spiral is a G, which is on the second line from the bottom."),
                new Slide("Images/Sheet Music, slide 5.png", "The bass clef indicates that the note between the two dots is an F, which is on the second line from the top."),
                new Slide("Images/Sheet Music, slide 6.png", "Next, the time signature tells you two things, the top number tells you how many beats (or pulses) are in one measure, and the bottom number what type of note represents each beat."),
                new Slide("Images/Sheet Music, slide 7.png", "Most commonly, you’ll find things in 4/4 time, which means there are four beats in a measure, and that a quarter note represents one beat."),
                new Slide("Images/Sheet Music, slide 8.png", "For example, ⅞ would mean there are seven notes in a measure, and an eighth note represents the beat."),
                new Slide("Images/Sheet Music, slide 9.png", "After that, you have the key signature, which tells you (as you might’ve guessed) what key you’re in by having sharp and flat signs on certain notes. (If you’re unsure about determining which key uses which key signature, see the lesson on “Keys”)."),
                new Slide("Images/Sheet Music, slide 10.png", "All you need to know really is that if a note has a sharp or flat sign on it in the key signature, it means always play that note (in any octave) with the correct sharp or flat unless specified otherwise."),
                new Slide("Images/Sheet Music, slide 11-12.png", "As far as reading a song specifically, you’ll see mostly combinations of notes and rests with bars in between."),
                new Slide("Images/Sheet Music, slide 11-12.png", "Here’s a list of which notes and rests represent what."),
                new Slide("Images/Sheet Music, slide 13-14.png", "Getting fluent with reading sheet music the same way you would read language takes time, but is very possible. "),
                new Slide("Images/Sheet Music, slide 13-14.png", "However, just like with learning a spoken language, becoming fluent in a new language takes a lot of time, but presents so many benefits."),

        };
        SlideShow lesson14 = new SlideShow("How to Read Sheet Music", lesson14_slides);
        MenuButton lesson14_button = new MenuButton(lesson14);
        this.frame.add(lesson14_button);



        this.frame.setLocationRelativeTo(null);
        this.frame.pack();
        this.frame.setLayout(new GridLayout(16,1));
        this.frame.setSize( 640, 480);
    }

    public void show(){
        this.frame.setVisible(true);
    }
}
