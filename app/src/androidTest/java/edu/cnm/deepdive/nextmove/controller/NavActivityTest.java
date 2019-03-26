package edu.cnm.deepdive.nextmove.controller;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import edu.cnm.deepdive.nextmove.R;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class NavActivityTest {

  @Rule
  public ActivityTestRule<NavActivity> activityTestRule =
      new ActivityTestRule<>(NavActivity.class);

  @Test
  public void navigateToNQueensFragment() {
    // Click on Navigation Item
    onView(withId(R.id.n_queens)).perform(click());

    // Make sure fragment is loaded
    onView(withId(R.id.board_layout)).check(matches(isDisplayed()));
  }

}