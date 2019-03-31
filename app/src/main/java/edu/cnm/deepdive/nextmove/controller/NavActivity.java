package edu.cnm.deepdive.nextmove.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import edu.cnm.deepdive.nextmove.R;
import edu.cnm.deepdive.nextmove.service.GoogleSignInService;

/*
This class is the main activity that all my fragments use as their context. This class loads my fragments
and also my nav drawer view. Allows the user to sign out. This also allows its users to navigate
between fragments.
 */

/**
 * Primary Controller Class for the NextMove App. This activity configures and responds to clicks in a
 * {@link edu.cnm.deepdive.nextmove.NextMoveApplication}
 */
public class NavActivity extends AppCompatActivity
    implements NavigationView.OnNavigationItemSelectedListener {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
    ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
        this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
    drawer.addDrawerListener(toggle);
    toggle.syncState();
    NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
    navigationView.setNavigationItemSelectedListener(this);
    Fragment fragmentHome = new HomeFragment();
    FragmentManager manager = getSupportFragmentManager();
    FragmentTransaction transaction = manager.beginTransaction();
    transaction.add(R.id.fragment_container, fragmentHome, "home");
    transaction.addToBackStack(null);
    transaction.commit();
  }

  @Override
  public void onBackPressed() {
    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
    if (drawer.isDrawerOpen(GravityCompat.START)) {
      drawer.closeDrawer(GravityCompat.START);
    } else {
      super.onBackPressed();
    }
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.main, menu);
    getMenuInflater().inflate(R.menu.options, menu);

    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {

    DialogFragment dialogFragment = new DialogueFragment();
    FragmentManager manager = getSupportFragmentManager();
    int id = item.getItemId();
    boolean handled = true;

    switch (item.getItemId()) {
      case R.id.action_settings:
        break;
      case R.id.sign_out:
        signOut();
        break;
      case R.id.info:
        dialogFragment.show(manager, "knights tour");
        break;
      default:
        handled = super.onOptionsItemSelected(item);
    }
    return handled;
  }

  @Override
  public boolean onNavigationItemSelected(MenuItem item) {

    switch (item.getItemId()) {
      case R.id.fragment_main:
        loadFragment(new HomeFragment(), R.id.fragment_container, "mainFragment", null);
        break;
      case R.id.n_queens:
        loadFragment(new NQueensFragment(), R.id.fragment_container, "nQueens", null);
        break;
      case R.id.knights_tour:
        loadFragment(new KnightsTourFragment(), R.id.fragment_container, "knightsTour", null);
        break;
      case R.id.high_score:
        loadFragment(new HighScoreFragment(), R.id.fragment_container, "highScore", null);
        break;
    }

    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
    drawer.closeDrawer(GravityCompat.START);
    return true;
  }

  public void loadFragment(Fragment fragment, int container, String tag, Bundle args) {
    FragmentManager manager = getSupportFragmentManager();
    if (args != null) {
      fragment.setArguments(args);
    }
    manager.beginTransaction()
        .replace(container, fragment, tag)
        .commit();
  }
/**
 * This activates the signOut button on the home screen. This will take back the user to the {@link LoginActivity}
 */
  private void signOut() {
    GoogleSignInService.getInstance().getClient()
        .signOut()
        .addOnCompleteListener(this, new OnCompleteListener<Void>() {
          @Override
          public void onComplete(@NonNull Task<Void> task) {
            GoogleSignInService.getInstance().setAccount(null);
            Intent intent = new Intent(NavActivity.this, LoginActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            NavActivity.this.startActivity(intent);
          }
        });
  }
}
