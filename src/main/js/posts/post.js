import React from 'react';

const Post = (props) => {
	return (
		<div className='post-main'>
			<div className='post-content'>
			    {props.post.content.split("\n").map((i,key) => { //adds content (posts) to the homepage, and can have new lines in posts
			        return <div key={key}>{i}</div>;
                })}
			</div>

            <div className='post-time'>
                 {props.post.time_stamp} //add time stamp to the homepage
            </div>
		</div>
	)
}

export default Post;
