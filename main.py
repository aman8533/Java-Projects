import sys


play = input('If you want to start the game, enter play game. If you dont, enter quit: ')
if play == 'quit':
  sys.exit()
elif play == 'play game':
  numcards = int(input('Please enter the number of cards to be played: '))
else:
  play = print('Please check your spelling and case')
while True:
  if numcards < 4:
    numcards = int(input('insufficient number of cards. Please enter a larger value'))
  elif numcards > 30:
    numcards = int(input('The value entered is too high. Please enter a lower value'))
  elif numcards % 2 == 1:
    numcards = int(input('Please enter an even value so the cards can be split evenly.'))
  else:
    break
f = open("dogs.txt", "r")

import random

class card:
  def __init__(self, name, exercise, intelligence,friendliness,drool):
    self.name = name
    self.exercise = exercise
    self.intelligence = intelligence
    self.friendliness = friendliness
    self.drool = drool

  def printcard(self):
    print("Name:",self.name)
    print("Exercise:",self.exercise)
    print("intelligence:",self.intelligence)
    print("friendliness:",self.friendliness)
    print("drool:",self.drool)
    print("-----------------")

dog = []
for i in range(numcards):
  temp = f.readline()
  temp = temp[:-1]
  dog.append(card(temp,random.randint(1,5),random.randint(1,100),random.randint(1,10),random.randint(1,10)))

player = []
computer = []

for i in range(int(numcards/2)):
  player.append(dog[i])

for i in range(int(numcards/2), len(dog)):
  computer.append(dog[i])

print(len(dog))
print(len(player))
print(len(computer))

for i in range(int(numcards/2)):
  player[i].printcard()

for i in range(int(numcards/2)):
  computer[i].printcard()