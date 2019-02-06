package com.aurora.player.views;

import android.view.Menu;

import com.aurora.d20_35_app.BR;
import com.aurora.d20_35_app.R;
import com.aurora.d20_35_app.databinding.ActivityPlayerCharactersListBinding;
import com.aurora.d20_35_app.helper.BindingActivity;
import com.aurora.player.viewModels.PlayerCharactersListVM;

import static com.aurora.d20_35_app.database.TranslationsHolder.translate;

public class PlayerCharactersListActivity extends BindingActivity<ActivityPlayerCharactersListBinding, PlayerCharactersListVM> {

    @Override
    public PlayerCharactersListVM onCreate() {
        setSupportActionBar(findViewById(R.id.toolbar));
        return new PlayerCharactersListVM(this);
    }

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_player_characters_list;
    }

    @Override
    protected void setTranslatedTexts() {
        getSupportActionBar().setTitle(translate("title_activity_pc_"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_player_characters_list, menu);
        menu.findItem(R.id.characters_list_settings_action).setTitle(translate("action_settings"));
        return true;
    }

    @Override
    public void onFragmentAttached() {

    }

    @Override
    public void onFragmentDetached(String tag) {

    }
}
