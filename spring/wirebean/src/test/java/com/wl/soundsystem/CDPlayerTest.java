package com.wl.soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by wangl on 2018/10/30 15:30
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(cd);
    }
}
