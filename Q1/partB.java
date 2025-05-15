public int dogWalkShift(int startHour, int endHour)
{
    int earnings = 0;

    for(int hour = startHour; hour <= endHour; hour++)
    {
        int dogsWalked = walkDogs(hour);
        earnings += dogsWalked * 5;

        if((hour >= 9 && hour <= 17) || dogsWalked == maxDogs)
            earnings += 3;
    }

    return earnings;
}
