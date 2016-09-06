package extra;

/**
 * Created by rutvik on 06-09-2016 at 11:19 PM.
 */

public class Log
{
    final static boolean showTag = true;

    public static void i(final String TAG, final String msg)
    {
        if (showTag)
        {
            android.util.Log.i(TAG, msg);
        }
    }

}
