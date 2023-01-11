

import java.util.Scanner;
import java.util.HashMap;
public class EternalSuffering
{
    boolean status = true;
    int repstop, situation, choice, finalscore = 0;
    //int score[] = new int[30];
    HashMap <String,String> score = new HashMap<>();

    String haha, game;
    Scanner input;
    double runender, creepingdifficulty = 0, blessing = 0;

    public void greeting()
    {
        System.out.println("Hello. Welcome to the random situation generator. This program will create a random series of situations and will prompt you to react, at least one option will cause you to fail. ");
        System.out.println("Good luck.");
        System.out.println("Press any button to continue");
        Scanner waitstop = new Scanner(System.in);
        haha = waitstop.nextLine();
    }

    public void letthegamebegin()
    {

        if((haha.equalsIgnoreCase("no") || haha.equalsIgnoreCase("nah")))
            creepingdifficulty = 2.8;

        if((haha.equalsIgnoreCase("please be gentle") || haha.equalsIgnoreCase("wait no") || haha.equalsIgnoreCase("waitno")))
            creepingdifficulty = -20;

        do{
            System.out.println("");
            situation = ((int)(Math.random()* 7));

            if((blessing != 2) && (creepingdifficulty > 1.5))
            {
                blessing = Math.random();
                if (blessing <= 0.66)
                {
                    System.out.println("You have received the blessing of Danny Devito. Coincidentally, this does nothing.");
                    System.out.println("");
                    System.out.println("");
                    creepingdifficulty = 0;
                    blessing = 2;
                }
            }

            runender = (Math.random() * creepingdifficulty);
            if (runender > 3)
            {

                System.out.println("You open your eyes. You are swiftly plummeting towards the ground. You are wearing something on your back");
                System.out.println("What do you do?");
                System.out.println("1. Pull parachute");
                System.out.println("2. Eat clove of garlic");
                System.out.println("3. Accept fate");
                System.out.println("4. Scream");

                input = new Scanner(System.in);
                choice = input.nextInt();
                switch(choice)
                {
                    case 1:
                        System.out.println("You pull a cord from your backpack, but instead of deploying a parachute, your backpack begins to hum like a chainsaw. You fall to your death.");
                        break;
                    case 2:
                        System.out.println("You shove an entire clove of garlic into your mouth and begin chewing furiously. Suddenly, you can feel yourself begin to slow down. Some greater force must have sensed your desperation");
                        System.out.println("and intervened; that is, until they dropped you again because you didn't have any more garlic. You fall to your death. If only you packed a second clove....");
                        score.put("runender2","-5 Abandoned by the Gods, + 2000 Martyred by the Cult of Garlic Bread");
                        break;
                    case 3:
                        System.out.println("You close your eyes and plummet to your death.");
                        break;
                    case 4:
                        System.out.println("You scream hysterically as you plummet to your death.");

                }
                break;
            }
            else if(runender > 2.7)
            {
                System.out.println("consider yourself lucky");
            }

            situation = ((int)(Math.random()* 7));
            while (situation == repstop)
            {
                situation = ((int)(Math.random()* 7));
            }
            switch(situation)
            {
                case 0:

                    System.out.println("You open your eyes. There is a cat in front of you. You assume it belongs to you. It meows at you, it must be trying to tell you that it is hungry");
                    System.out.println("What do you do?");
                    System.out.println("1. Feed the cat some cat food");
                    System.out.println("2. Feed the cat a croissant");
                    System.out.println("3. Feed the cat some lasagna");
                    System.out.println("4. Feed the cat yourself");
                    input = new Scanner(System.in);
                    choice = input.nextInt();
                    switch(choice)
                    {
                        case 1:
                            System.out.println("The cat eats the cat food and is content. You black out....");
                            score.put("cat1","+5 Fed cat");
                            break;
                        case 2:
                            System.out.println("You toss a croissant to the cat. Just as it reaches to catch it, Carl Wheezer bursts through a wall and intercepts it. The cat is sad, but you survive the blast with minor injuries. You");
                            System.out.println(" black out....");
                            score.put("cat2","-40000 Made cat sad");
                            break;
                        case 3:
                            System.out.println("You heat up some lasagna in the microwave and feed it to the cat with a fork. Just as the cat opens it's mouth to eat the lasagna there is a sudden crash as the house around you is being");
                            System.out.println("crushed under some massive weight. The scent of the lasagna attracted something much, much larger....");
                            status = false;
                            score.put("cat3","+400 Gave cat lasagna");
                            break;
                        case 4:
                            System.out.println("You roll up your sleeve and let the cat bite your arm. It hurts. The cat is no less sated but now you are both in pain. You black out....");
                            status = true;
                            score.put("cat4","+3 Signed blood pact with cat");
                    }
                    break;


                case 1:
                    System.out.println("You open your eyes. You are sitting in an empty diner. You look around but have no idea what year it is. A voice over the PA asks what you will order.");
                    System.out.println("What do you do?");
                    System.out.println("1. Order the spaghetti");
                    System.out.println("2. Order the flesh of the unborn");
                    System.out.println("3. Order a drink");
                    System.out.println("4. Attempt escape");
                    input = new Scanner(System.in);
                    choice = input.nextInt();
                    switch(choice)
                    {
                        case 1:
                            System.out.println("A plate of spaghetti appears before you. The sauce is yellow but tastes like broccoli. The meatballs are transparent and tough. You are unsure how to feel You are about to vomit, but you");
                            System.out.println("black out again....");
                            score.put("diner1","-10 Ate weird spaghetti");
                            break;
                        case 2:
                            System.out.println("A plate of scrambled eggs appears before you. You are pleasantly surprised, but the eggs are a bit too salty. You black out....");
                            break;
                        case 3:
                            System.out.println("Nothing happens. You are disappointed in your lack of refreshment. You consider giving this place a bad review on Yelp if you return to the realm of the living, but you black out before");
                            System.out.println("you can finish your thoughts....");
                            score.put("diner3","-3 Parched");
                            break;
                        case 4:
                            System.out.println("You attempt to rush out of your seat and out the door, but you find yourself running for much longer than anticipated towards the door. After what seems to be an eternity, you finally reach");
                            System.out.println("the door. You open it, but it only leads to another identical diner. You look behind yourself in confusion, but there is only void behind you. You open your eyes again. You are sitting down");
                            System.out.println(" again, but you cannot move anymore. The PA is silent, and you feel apprehensive. Your vision fades, but you are not blacking out....");
                            score.put("diner4","-40 Stuck in temporal loop");
                            status = false;
                    }
                    break;


                case 2:
                    System.out.println("You open your eyes. Your skin burns with a familiar sensation. You are standing in a desert. An unnatural monstrosity is resting before. It is a sphinx. It briefly looks at you, then it asks");
                    System.out.println("you, \"What dat mouf do?\"");
                    System.out.println("How do you reply?");
                    System.out.println("1. Leg?");
                    System.out.println("2. Egg?");
                    System.out.println("3. Face?");
                    System.out.println("4. Flee");
                    input = new Scanner(System.in);
                    choice = input.nextInt();
                    switch(choice)
                    {
                        case 1:
                            System.out.println("The sphinx replies \"Yes, mouth bite leg.\" You wait for it to ask you another riddle, but it is already occupied with sunbathing. You turn to face the sun, but you black out before");
                            System.out.println("you can turn around....");
                            score.put("sphinx1","+5 Answered riddle correctly");
                            break;

                        case 2:
                            System.out.println("The sphinx replies,\"Yes, mouth eat egg.\" You open your mouth, about to question it further, but decide it would be better not to do so. You patiently wait to black out again, but");
                            System.out.println("the gaze of the sphinx is a bit too intense for you to feel tired. You briefly excuse yourself, then black out.");
                            score.put("sphinx2","+5 Answered riddle correctly");
                            break;

                        case 3:
                            System.out.println("The sphinx glares at you with unnerving discontent. \"NO, MOUTH DOES NOT FACE\" echoes from within you mind. You are staggered from the great mental strain. Unfortunately, the tiny");
                            System.out.println("step you took attracted the attention of a large sandworm, which erupts violently through the sand. The sandworm misses you, but instead accidentally knocks the sphinx on top of you...");
                            status = false;
                            score.put("sphinx5","-5 Answered riddle incorrectly");
                            break;

                        case 4:
                            System.out.println("You sprint away from the sphinx as fast as you can possibly can. It is unbothered. You lie down behind a sand dune in an attempt to hide. As you wait to black out next, a scorpion stings");
                            System.out.println("you. You begin to think of an appropriate way to berate the scorpion for its complete lack of manners, but black out before you can do anything.");
                            score.put("sphinx4","-15 Dishonorable at answering riddles");
                            break;
                    }
                    break;


                case 3:
                    System.out.println("You open your eyes.You cannot see anything. You are blindfolded. From everywhere around you, seemingly dozens of people are screaming \"EAT IT\" as loud as their lungs can handle.");
                    System.out.println("What do you do?");
                    System.out.println("1. Eat whatever's in front of you");
                    System.out.println("2. Refrain from eating \"it\"");
                    System.out.println("3. Pretend to be dead");
                    System.out.println("4. Try to take the blindfold off");
                    input = new Scanner(System.in);
                    choice = input.nextInt();
                    switch(choice)
                    {
                        case 1:
                            System.out.println("You open your mouth and fumble with your hands until you find what is in front of you. Smooth, tough but brittle exterior, you determine that there is bread in front of you. You take a");
                            System.out.println(" bite. The roaring cheers around you makes it difficult to think. The behaviour of the crowd makes you a bit anxious. You have inadvertently eaten the bread at a startling pace, but it");
                            System.out.println("doesn’t seem like it got any smaller. You are choking on the sheer amount of bread in your throat. The visceral screams of the crowd are the last things you hear....");
                            status = false;
                            score.put("blind1","+100 Ate \"it\"");
                            break;

                        case 2:
                            System.out.println("You shut your mouth tightly and sit still. The crowd gradually dies down, but begins to riot instead. You can hear strange rustling as something being thrown at you. It hits you in the");
                            System.out.println("face. It was a beanbag chair. You black out....");
                            score.put("blind2","-20 Did not eat \"it\", -50 Got beaned");
                            break;

                        case 3:
                            System.out.println("You go limp in your seat. The crowd falls dead silent. Something is painfully ripped off your face, but you can see again. You are sitting down at a picnic table in a park with an entire");
                            System.out.println("birthday cake in front of you. You look around, but there are no humans in sight. Instead, you are surrounded by squirrels. You decide to serve the squirrels some birthday cake. Just as ");
                            System.out.println("the last squirrel receives a slice of cake, you black out....");
                            score.put("blind3","+30 Gave squirrels some cake");
                            break;

                        case 4:
                            System.out.println("You try to take off whatever is blocking your vision but your fingers slip through and into your hair. You try to touch your face but it is completely smooth. The crowd whispers,\"Go on,");
                            System.out.println("eat it.\"You can no longer find you mouth. Your conscience fades, as you no longer have eyes to black out.");
                    }
                    break;/*

                case 4:
                    System.out.println("You open your eyes. There is a goat in front of you. You realize you are standing on top of a mountain at dawn. The sun is beautiful.");
                    boolean loop;
                    do
                    {
                        loop = false;
                        System.out.println("What do you do?");
                        System.out.println("1. Ride goat");
                        System.out.println("2. Watch sunrise");
                        System.out.println("3. Leap off mountain");
                        System.out.println("4. Tell the goat your sins");
                        input = new Scanner(System.in);
                        choice = input.nextInt();
                        switch(choice)
                        {
                            case 1:
                                System.out.println("You hop onto the goat, but phase right through it. You realize it is much colder than you felt earlier. You open your eyes again. You are lying on the ground, freezing and barely conscious.");
                                System.out.println("There is a blinding light in front of you. You can hear a man discussing something about missing lamb sauce and a broken walk-in freezer. You black out again");

                                break;
                            case 2:
                                System.out.println("You sit down to watch the sunrise. The sun is brilliantly burning in the sky. The view of the surrounding landscape is simply breathtaking. You realize that the goat has not moved at all in ");
                                System.out.println("the last... wait, how long have you been up there for? You collapse....");
                                status = false;
                                score [14] = 1;

                                break;
                            case 3:
                                System.out.println("Are you sure you want to leap off this mountain?");
                                System.out.println("1. yep");
                                System.out.println("2. Actually, I change my mind");
                                Scanner jumpinput = new Scanner(System.in);
                                int jumpchoice = jumpinput.nextInt();

                                if(jumpchoice == 2){
                                    System.out.println("");
                                    System.out.println("The goat screams at absolutely nothing.");
                                    loop = true;
                                    score[17] = 1;}

                                if(jumpchoice == 1)
                                {
                                    System.out.println("You leap straight off the mountain. The goat considers jumping with you, but is distracted by absolutely nothing. You plummet for a while before slamming into a small bounce pad,");
                                    System.out.println("exactly where you would land. A small group of people approach you, saying \"Very good, cousin, now we can make them pay.\" You have no idea who the people around you are. You");
                                    System.out.println("black out....");
                                    score[15] = 1;
                                }
                                break;
                            case 4:
                                System.out.println("You lean in to tell the goat your previous wrongdoings, but realize you have no memories. The goat smiles. It has the teeth of many different animals.\"Do not fear, my child, you will soon be");
                                System.out.println("stained the same as I.\"You feel something pulling your eyelids down. You black out....");
                                score[16] = 1;
                                break;
                        }
                    }while(loop == true);
                    break;


                case 5:
                    System.out.println("You open your eyes. You are standing in a grassy field. There is a giraffe in front of you, eating from a tree. It is wearing a fez.");
                    System.out.println("What do you do?");
                    System.out.println("1. Scream");
                    System.out.println("2. Knock hat off");
                    System.out.println("3. Lie down and cry");
                    System.out.println("4. Try to find civilization");
                    input = new Scanner(System.in);
                    choice = input.nextInt();
                    switch(choice)
                    {
                        case 1:
                            System.out.println("You scream into the empty field until you are somewhat exhausted. You hear something moving behind you. You spin around, the giraffe is figuratively breathing down your neck. It raises a ");
                            System.out.println("single hoof to your mouth, and hushes you. It gently caresses your face. You black out....");
                            score[19] = 1;
                            break;
                        case 2:
                            System.out.println("You try to climb onto the giraffe and attempt to climb onto its neck to knock off its hat. The giraffe senses your malicious intent, and instantaneously atomizes you for your barbarism.");
                            status = false;
                            score[20] = 1;
                            break;
                        case 3:
                            System.out.println("You curl into a ball and begin to sob vehemently. The giraffe goes to you and places a fedora on your head. Blessed by this sacred relic, you ascend beyond the plane of existence,");
                            System.out.println("transcending all other beings. Your vision fades to white....");
                            game = "won";
                            status = false;
                            break;
                        case 4:
                            System.out.println("You look around a few hills but find nothing. You sigh and decide to try to climb a tree to get a better view. As you climb the tree, you cause a small branch to snap off of the tree. The");
                            System.out.println("giraffe is visibly shaken. In your mind you can hear something scream, \"THE FABRIC OF REALITY HAS BEEN DESTROYED\" in an instant, everything is sucked into a massive abyss. Except for you,");
                            System.out.println("of course, so I suppose that's sorta cool. You black out....");
                            score[21] = 1;
                            break;
                    }
                    break;

                case 6:
                    System.out.println("You open your eyes. You are running away from something, but your legs are moving unnaturally fast.");
                    boolean loop2;
                    do
                    {
                        loop2 = false;

                        System.out.println("What do you do?");
                        System.out.println("1. Slow down");
                        System.out.println("2. Speed up");
                        System.out.println("3. Stop");
                        System.out.println("4. Stop and T-pose");
                        input = new Scanner(System.in);
                        choice = input.nextInt();
                        switch(choice)
                        {
                            case 1:
                                System.out.println("You slow down to a humanly plausible pace and look behind you. In the distance, a massive roiling mound of abstract shapes churns menacingly in the distance. It is moving much faster");
                                System.out.println("than you were moving initially. Try as you might, there is no escape.");
                                status = false;
                                score[22] = 1;
                                break;
                            case 2:
                                System.out.println("You try to speed up, as you are certain that whatever is behind is not pleasant, but you find that your attempts are actually slowing yourself down. Just as you consider giving up, you");
                                System.out.println("hear voice echo in your head, \"GOTTA GO FAST\". You begin running so fast that gravity can no longer contain you. Your human atoms simply were not made for such speeds. Your visions");
                                System.out.println("instantly goes black, you are too fast for mere light to be processed by your body....");
                                score[23] = 1;
                                break;
                            case 3:
                                System.out.println("OK. Think about this. You are moving faster than any human being has ever been before, with or without vehicles. Do you really think there is a good reason to stop right now?");
                                System.out.println("1. ye but what if I gotta pee or something");
                                System.out.println("2. Yeah you probably right imma keep going");
                                Scanner stopinput = new Scanner(System.in);
                                int stopchoice = stopinput.nextInt();

                                if(stopchoice == 1)
                                {
                                    System.out.println("You abruptly stop");
                                    System.out.println("");
                                }

                                if(stopchoice == 2)
                                {
                                    System.out.println("You continue running.");
                                    loop2 = true;
                                }
                                break;
                            case 4:
                                System.out.println("Dude, seriously?");
                                System.out.println("1. Just let me T-pose already");
                                System.out.println("2. Alright, alright");
                                stopinput = new Scanner(System.in);
                                stopchoice = stopinput.nextInt();

                                if(stopchoice == 1)
                                {
                                    System.out.println("You swiftly stop and begin to T-pose. You can see the grass swaying in the wind, then it freezes in place. Everything is silent. You still have no idea why you were running. You feel");
                                    System.out.println("that you are in complete control. You decide to pass into the next situation....");
                                    score[25] = 1;
                                }

                                if(stopchoice == 2)
                                {
                                    System.out.println("You continue running.");
                                    loop2 = true;
                                }
                                break;
                        }
                    }while(loop2 == true);
                    break;


                case 7:
                    System.out.println("you've been gnomed");*/
            }

            System.out.println("");
            System.out.println("Press anything to continue");
            Scanner waitstop = new Scanner(System.in);
            haha = waitstop.nextLine();
            creepingdifficulty = (creepingdifficulty + Math.random());
            repstop = situation;

        }while(status == true);
    }



    public void boi()
    {
        System.out.println("");
        System.out.println("");
        if(game == "won")
        {
            System.out.println("Congratulations, you have become a higher being and have beat this game, probably either by sheer luck or trial and error.");
            System.out.println("Your heroic actions shall be forevermore celebrated!");

            System.out.println("");
            System.out.println("+3000 Ascended mortality");
            finalscore = (finalscore + 3000);
        }
        else{
            System.out.println("You are dead, but your actions live on.");
            System.out.println("");
            System.out.println("-5 Died");
            finalscore = (finalscore - 5);
        }

        System.out.println("In no particular order:");
        System.out.println(score.values());

        if(score.containsKey("cat1"))
            {finalscore = (finalscore +5);}


        if(score.containsKey("cat2"))
        {
            finalscore = (finalscore - 40000);
        }





/*
        if(score[0] == 1){
            System.out.println("-40000 Made cat sad");
            finalscore = (finalscore - 40000);}

        if (score[1] == 1){
            System.out.println("+400 Gave cat lasagna");
            finalscore = (finalscore + 400);}

        if (score[2] == 1){
            System.out.println("+3 Signed blood pact with cat");
            finalscore = (finalscore + 3);}

        if (score[3] == 1){
            System.out.println("+5 Fed cat");
            finalscore = (finalscore + 5);}

        if (score[4] == 1){
            System.out.println("-10 Ate weird spaghetti");
            finalscore = (finalscore - 10);}

        if (score[5] == 1){
            System.out.println("-3 Parched");
            finalscore = (finalscore - 3);}

        if (score[6] == 1){
            System.out.println("-40 Stuck in temporal loop");
            finalscore = (finalscore - 40);}

        if (score[7] == 1 || score[8] == 1){
            System.out.println("+5 Answered riddle correctly");
            finalscore = (finalscore + 5);}

        if (score[9] == 1){
            System.out.println("-5 Answered riddle incorrectly");
            finalscore = (finalscore - 5);}

        if (score[10] == 1){
            System.out.println("-15 Dishonorable at answering riddles");
            finalscore = (finalscore - 15);}

        if (score[11] == 1){
            System.out.println("+100 Ate \"it\"");
            finalscore = (finalscore + 100);}

        if (score[12] == 1){
            System.out.println("-20 Did not eat \"it\"");
            finalscore = (finalscore - 70);
            System.out.println("-50 Got beaned");}

        if (score[13] == 1){
            System.out.println("+30 Gave squirrels some cake");
            finalscore = (finalscore + 30);}

        if (score[14] == 1){
            System.out.println("-10 Asphyxiated on a mountain");
            System.out.println("+10 Saw nice sunrise");}

        if (score[15] == 1){
            System.out.println("+5 Cooly jumped off mountain");
            System.out.println("-100 Recklessness");
            finalscore = (finalscore - 95);}

        if (score[16] == 1){
            System.out.println("-5 Met The Devil");
            finalscore = (finalscore - 5);}

        if (score[17] == 1){
            System.out.println("-5 Indecisive");
            finalscore = (finalscore - 5);}

        if (score[18] == 1){
            System.out.println("-5 Abandoned by the Gods");
            finalscore = (finalscore + 1995);
            System.out.println("+ 2000 Martyred by the Cult of Garlic Bread");}

        if (score[19] == 1){
            System.out.println("+90 Caressed by giraffe");
            finalscore = (finalscore + 90);}

        if (score[20] == 1){
            System.out.println("-200 Rude to giraffe");
            finalscore = (finalscore - 200);}

        if (score[21] == 1){
            System.out.println("-200000 Committed universal genocide");
            System.out.println("+199998 It was an accident");
            finalscore = (finalscore - 2);}

        if (score[22] == 1){
            System.out.println("-5 Consumed by geometric nightmare");
            finalscore = (finalscore - 5);}

        if (score[23] == 1){
            System.out.println("+4000 Completely destroyed those physics nerds");
            System.out.println("-5000 Definitely went faster than 30 in a school zone");
            finalscore = (finalscore - 1000);}

        if (score[25] == 1){
            System.out.println("+450 Did it to 'em");
            finalscore = (finalscore + 450);}*/

        System.out.println("");
        System.out.println("Your final score is "+finalscore);

    }
}
