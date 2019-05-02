import React from 'react';

const Post = (props) => {
	return (
		<div className='post-main'>
			<div className='post-content'>
				{props.post.content} //adds the content (posts) to the homepage
			</div>

            <div className='post-time'>
                 {props.post.time_stamp} //add time stamp to the homepage
            </div>
		</div>
	)
}

export default Post;
