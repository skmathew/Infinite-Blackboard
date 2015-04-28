package unt.infiniteblackboard;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.TextView;

/**
 * Created by zijia on 3/27/2015.
 */
public class ScoreKeeper {

    private ScoreKeeper() {}

    private static String[] mAllQuestions = new String[] {
            AccelerationQAActivity.class.getSimpleName(),
            //ConstantVelocityQAActivity.class.getSimpleName(),
            OneDMotionQAActivity.class.getSimpleName(),
            SpeedQAActivity.class.getSimpleName(),
            TwoDMotionQAActivity.class.getSimpleName(),
            VelocityQAActivity.class.getSimpleName()
    };

    private static SharedPreferences getPreferences(Context context) {
       return PreferenceManager.getDefaultSharedPreferences(context);

    }

    private static SharedPreferences.Editor getPrefEditor(Context context) {
        return getPreferences(context).edit();
    }

    public static void addPoint(Context context, String classSimpleName) {
        SharedPreferences.Editor editor = getPrefEditor(context);
        editor.putInt(classSimpleName,1);
        editor.commit();
    }

    public static void subtractPoint(Context context, String classSimpleName) {
        SharedPreferences.Editor editor = getPrefEditor(context);
        editor.putInt(classSimpleName,0);
        editor.commit();
    }

    public static int getTotalCorrect(Context context) {
        SharedPreferences prefs = getPreferences(context);
        int totalCorrect = 0;
        for (int i = 0; i < mAllQuestions.length; i++) {
            int itemCorrect = prefs.getInt(mAllQuestions[i],0);
            totalCorrect = totalCorrect + itemCorrect;
        }

        return totalCorrect;
    }

    public static void updateScore(Context context, TextView scoreText) {
        scoreText.setText(Integer.toString(ScoreKeeper.getTotalCorrect(context)));
    }

    public static void clearScore(Context context) {
        getPrefEditor(context).clear().commit();
    }
}
