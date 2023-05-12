- Design justification (including a brief discussion of at least one alternative you considered)
    The game is built such that it has 3 rounds and the scores increment throughout the rounds. All three rounds use Scanner and Random to output random questions and to take in input from the user which determines the score. I chose to make the game sequential such that it progresses in order for ease of coding as well as user understanding. The main class calls on each of the game classes (Riddle, MathGame, BossGame) and uses while loops to keep track of round numbers. An alternate way I thought of doing it was creating a parent class for Riddle and MathGame, and using that parent class as the firast 2 rounds. Theoretically, this would have worked as the code inside Riddle and MathGame is essentially the same except for the questions that are being asked and when they are being called inside the main class. I decided against using that as I was unsure of how the instances of the parent class would work as the arrays of stings were different for both classes and wanted to figure it out once I had a minimally viable product.

- What was your **overall approach** to tackling this project?
    I approached this project from a minimally viable project standpoint. I wanted to start with something that worked and expand on it. Unfortunately, I could barely get my minimally viable project to work and did not get the chance to improve it greatly but the game works! 

- What **new thing(s)** did you learn / figure out in completing this project?
    I learned how to use NextInt from the Random class to output a combination of 3 random numbers and set it up in a way that can allow people to guess them

- Is there anything that you wish you had **implemented differently**?
    As I mentioned above in my alternate design version, I would make a parent class and implement those for the first 2 rounds of the game.

- If you had **unlimited time**, what additional features would you implement?
    As Prof. Crouser suggested, I would have wanted to make the last round as a form of wordle where the user would find out what numbers they had input were correct and what were not. I would also make it so that the riddles do not repeat once they have been printed out.

- What was the most helpful **piece of feedback** you received while working on your project? Who gave it to you?
    The most helpful piece of feedback I received was from Prof. Crouser when he helped me figure out associations in my planning phase. Also, big shout out to Logan in the 10.50 section for helping me figure out my compilation error!

- If you could go back in time and give your past self some **advice** about this project, what hints would you give?
    I would give hints about how the associations work between the 3 game classes and the main BadBoniAdventureGame class.