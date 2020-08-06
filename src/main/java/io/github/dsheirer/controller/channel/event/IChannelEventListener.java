package io.github.dsheirer.controller.channel.event;

import io.github.dsheirer.sample.Listener;

public interface IChannelEventListener
{
	public Listener<ChannelEvent> getChannelEventListener();
}
