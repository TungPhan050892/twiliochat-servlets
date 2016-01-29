package com.twilio.chat;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TwilioTokenCreatorTest {

    @Test(expected = IncompleteConfigException.class)
    public void shouldNotInitializeTwilioTokenCreatorWhenAppConfigIsIncomplete() {
        AppConfig mockedAppConfig = mock(AppConfig.class);
        when(mockedAppConfig.isIncomplete()).thenReturn(true);
        new TwilioTokenCreator(mockedAppConfig);
    }
}
