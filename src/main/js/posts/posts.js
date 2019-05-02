import React from 'react';
import Post from './post'

class Posts extends React.Component {
  constructor(props) {
    super(props);
    this.getPosts = this.getPosts.bind(this);
  }

	render() {
		return (
      <article className='posts-main'>
        <h1 className='posts-title'>
          Posts
        </h1>
  			<div className='posts-items'>
  				{this.getPosts()}
  			</div>
      </article>
		)
	}

  getPosts() {
    return this.props.posts.sort( function(a, b){               //orders the posts by newest
    return new Date(b.time_stamp) - new Date(a.time_stamp);
    }).map(post =>
        <Post key={post._links.self.href} post={post}/>         //displays the posts
	);
  }
}

export default Posts;
