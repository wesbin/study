<template>
  <div>
    <div class="user-container">
      <div>
        <svg aria-hidden="true" focusable="false" data-prefix="fas" data-icon="user" class="svg-inline--fa fa-user"
             role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512">
          <path fill="currentColor"
                d="M224 256c70.7 0 128-57.31 128-128s-57.3-128-128-128C153.3 0 96 57.31 96 128S153.3 256 224 256zM274.7 304H173.3C77.61 304 0 381.6 0 477.3c0 19.14 15.52 34.67 34.66 34.67h378.7C432.5 512 448 496.5 448 477.3C448 381.6 370.4 304 274.7 304z"></path>
        </svg>
      </div>
      <div class="user-description">
        <div>
          <slot name="username">
            {{ fetchedUser.id }}
          </slot>
        </div>
        <div class="time">
          <span>
            <slot name="time">
              Joined {{ fetchedUser.created }}, {{ fetchedUser.karma }}
            </slot>
          </span>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import {mapGetters} from 'vuex';

export default {
  name: 'UserProfile',
  props: {
    info: Object
  },
  computed: {
    ...mapGetters(['fetchedUser'])
  },
};
</script>

<style scoped>
.user-container {
  display: flex;
  align-items: center;
  padding: 0.5rem;
}

.fa-user {
  width: 30px;
  font-size: 2.5rem;
}

.user-description {
  padding-left: 8px;
}

.time {
  font-size: 0.7rem;
}

.karma {
  font-size: 0.7rem;
}
</style>