/*
 * Copyright (C) 2017 The AndroidCoreText Project
 */

package com.hyena.coretext.event;

import com.hyena.coretext.blocks.CYEditBlock;

/**
 * Created by yangzc on 17/2/6.
 */
public interface CYFocusEventListener {

    public void onFocusChange(boolean focus, CYEditBlock editBlock);

}