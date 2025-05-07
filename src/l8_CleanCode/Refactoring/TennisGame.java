package l8_CleanCode.Refactoring;

public class TennisGame {

    private static final int MINIMUM_POINTS_FOR_ADVANTAGE_OR_WIN = 4;
    private static final int SCORE_DIFFERENCE_FOR_ADVANTAGE = 1;
    private static final int SCORE_DIFFERENCE_FOR_WIN = 2;
    private static final int SCORE_LOVE = 0;
    private static final int SCORE_FIFTEEN = 1;
    private static final int SCORE_THIRTY = 2;
    private static final int SCORE_FORTY = 3;

    private static final String TEXT_LOVE = "Love";
    private static final String TEXT_FIFTEEN = "Muoi Lam";
    private static final String TEXT_THIRTY = "Ba Muoi";
    private static final String TEXT_FORTY = "Bon Muoi";
    private static final String TEXT_ALL_SUFFIX = "-Deu";
    private static final String TEXT_DEUCE = "Deu";
    private static final String TEXT_ADVANTAGE_PREFIX = "Loi the cho ";
    private static final String TEXT_WIN_PREFIX = "Thang cho ";
    private static final String TEXT_SCORE_SEPARATOR = "-";

    private int player1Score;
    private int player2Score;
    private String player1Name;
    private String player2Name;

    public TennisGame(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
        this.player1Score = SCORE_LOVE;
        this.player2Score = SCORE_LOVE;
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(this.player1Name)) {
            player1Score++;
        } else if (playerName.equals(this.player2Name)) {
            player2Score++;
        }
    }

    public String getScore() {
        if (areScoresEqual()) {
            return getEqualScoreText();
        }

        if (isGameInAdvantageOrWinState()) {
            return getAdvantageOrWinText();
        }

        return getDefaultScoreText();
    }

    private boolean areScoresEqual() {
        return player1Score == player2Score;
    }

    private String getEqualScoreText() {
        switch (player1Score) {
            case SCORE_LOVE:
                return TEXT_LOVE + TEXT_ALL_SUFFIX;
            case SCORE_FIFTEEN:
                return TEXT_FIFTEEN + TEXT_ALL_SUFFIX;
            case SCORE_THIRTY:
                return TEXT_THIRTY + TEXT_ALL_SUFFIX;
            default:
                return TEXT_DEUCE;
        }
    }

    private boolean isGameInAdvantageOrWinState() {
        return player1Score >= MINIMUM_POINTS_FOR_ADVANTAGE_OR_WIN
                || player2Score >= MINIMUM_POINTS_FOR_ADVANTAGE_OR_WIN;
    }

    private String getAdvantageOrWinText() {
        int scoreDifference = player1Score - player2Score;

        if (scoreDifference == SCORE_DIFFERENCE_FOR_ADVANTAGE) {
            return TEXT_ADVANTAGE_PREFIX + player1Name;
        }
        if (scoreDifference == -SCORE_DIFFERENCE_FOR_ADVANTAGE) {
            return TEXT_ADVANTAGE_PREFIX + player2Name;
        }
        if (scoreDifference >= SCORE_DIFFERENCE_FOR_WIN) {
            return TEXT_WIN_PREFIX + player1Name;
        }
        return TEXT_WIN_PREFIX + player2Name;
    }

    private String getDefaultScoreText() {
        String scoreTextForPlayer1 = convertScoreToText(player1Score);
        String scoreTextForPlayer2 = convertScoreToText(player2Score);
        return scoreTextForPlayer1 + TEXT_SCORE_SEPARATOR + scoreTextForPlayer2;
    }

    private String convertScoreToText(int score) {
        switch (score) {
            case SCORE_LOVE:
                return TEXT_LOVE;
            case SCORE_FIFTEEN:
                return TEXT_FIFTEEN;
            case SCORE_THIRTY:
                return TEXT_THIRTY;
            case SCORE_FORTY:
                return TEXT_FORTY;
            default:
                return "";
        }
    }
}