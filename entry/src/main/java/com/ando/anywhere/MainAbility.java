package com.ando.anywhere;

import com.ando.anywhere.slice.MainAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;
import ohos.bundle.IBundleManager;
import ohos.security.SystemPermission;

public class MainAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(MainAbilitySlice.class.getName());

        reqPermission();
    }

    private void reqPermission() {
        if (verifySelfPermission(SystemPermission.DISTRIBUTED_DATASYNC) == IBundleManager.PERMISSION_GRANTED) {
            this.continueAbility();
        } else {
            requestPermissionsFromUser(new String[]{SystemPermission.DISTRIBUTED_DATASYNC}, 1);
        }
    }

}
