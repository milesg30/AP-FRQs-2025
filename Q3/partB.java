public ArrayList<Match> buildMatches()
{
    ArrayList<Match> matches = new ArrayList<Match>();

    int bestIndex = competitorList.size() % 2;
    int worstIndex = competitorList.size() - 1;

    while(bestIndex < worstIndex)
    {
        matches.add(new Match(
                competitorList.get(bestIndex),
                competitorList.get(worstIndex)));

        bestIndex++;
        worstIndex--;
    }

    return matches;
