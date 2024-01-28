Hi
* Please forgive me if my Java coding doesn’t meet the standards. I am not a Java developer.
* Use the *`run.sh`* script to run the tests.
* I used the **Chain of Responsibility** **Design Pattern** which `HandRanker` is responsible for determining the rank of a hand.
* It starts with `Royal Flush` and then lower ranks and if no hand pattern was matched, it will be `High Cards`.
* Starting from lower ranks need to make sure it is not a higher rank. For example a `Pair` might be also a `Two Pair` or `Full House` so it is easier to start from the highest rank.
* The ranks values are relative to each other so you can add as many ranks as you like without changing the logic.
* I found the tests for the `Four of a kind`, `Straight Flush` and `Royal Flush` are missing so I added the following hands to the tests.

```
TH JH QH KH AH 2C 3C 4C 5C 6C
7S 8S 9S TS JS 8S 8C 5H 8D 8H
5C 2C 7C TC KC 8S 3S TS 4S 2S
```