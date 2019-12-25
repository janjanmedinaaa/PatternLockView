package com.andrognito.patternlockview.listener;

import com.andrognito.patternlockview.PatternLockView;

import java.util.List;

public class DefaultLockViewListener implements PatternLockViewListener {
    @Override
    public void onStarted() { }

    @Override
    public void onProgress(List<PatternLockView.Dot> progressPattern) { }

    @Override
    public void onComplete(List<PatternLockView.Dot> pattern) { }

    @Override
    public void onCleared() { }
}
